import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Manager {
    private final String[] arrConst = {"NEW", "IN_PROGRESS", "DONE"};
    private int countTask;
    private int countEpic;
    HashMap<Integer, Task> mapTask = new HashMap<>();
    HashMap<Integer, Epic> mapEpic = new HashMap<>();
    ArrayList<Subtask> listSubtask = new ArrayList<>(10);

    public void createAndAddTaskToMap(Task newObj) {
        ++countTask;
        mapTask.put(countTask, newObj);
    }

    public void createAndAddEpicToMap(Epic newObj) {
        ++countEpic;
        mapEpic.put(countEpic, newObj);
    }

    public void createAndAddSubtaskToList(Subtask newObj) {
        listSubtask.add(newObj);
    }

    public void printTaskMap() {
        for (Map.Entry<Integer, Task> entry : mapTask.entrySet()) {
            Integer key = entry.getKey();
            Task value = entry.getValue();
            System.out.println("Задача с идентификатором " + key + ": " + value);
        }
        System.out.println();
    }

    public void printEpicMap() {
        for (Map.Entry<Integer, Epic> entry : mapEpic.entrySet()) {
            Integer key = entry.getKey();
            Epic value = entry.getValue();
            System.out.println("Эпик с идентификатором " + key + ": " + value);
        }
        System.out.println();
    }

    public void printSubtaskList() {
        for (Subtask obj : listSubtask) {
            System.out.println("Подзадача с идентификатором " + obj.idTask + ": " + obj);
        }
        System.out.println();
    }

    public void deleteAllTask() {
        mapTask.clear();
    }

    public void deleteAllEpic() {
        mapEpic.clear();
    }

    public void deleteAllSubtask() {
        listSubtask.clear();
    }

    public Task getTaskById(int idTask) {
        return mapTask.get(idTask);
    }

    public Epic getEpicById(int idEpic) {
        return mapEpic.get(idEpic);
    }

    public Subtask getSubtaskById(int idSubtask) {
        for (Subtask obj : listSubtask) {
            if (obj.idTask == idSubtask) return obj;
        }
        System.out.println("С таким id подзадач нет");
        return null;
    }

    public void deleteTaskById(int idTask) {
        mapTask.remove(idTask);
    }

    public void deleteEpicById(int idEpic) {
        mapEpic.remove(idEpic);
    }

    public void deleteSubtaskById(int idSubtask) {
        for (int i = 0; i < listSubtask.size(); i++) {
            if (listSubtask.get(i).idTask == idSubtask - 1) listSubtask.remove(i);
        }
    }

    public void updateTask(Task newObj, int idTask) {
        mapTask.replace(idTask, mapTask.get(idTask), newObj);
    }

    public void updateEpic(Epic newObj, int idEpic) {
        int countNew = 0;
        int countInProgress = 0;
        int countDone = 0;

        for (Subtask st : listSubtask) {
            if (st.idTask == idEpic) {
                if (st.statusTask.equals(arrConst[0])) countNew++;
                if (st.statusTask.equals(arrConst[1])) countInProgress++;
                if (st.statusTask.equals(arrConst[2])) countDone++;
            }
        }
        if ((countNew == 0 && countInProgress == 0 && countDone == 0) || (countNew > 0 && countInProgress == 0 && countDone == 0))
            newObj.statusTask = arrConst[0];
        if (countInProgress > 0) newObj.statusTask = arrConst[1];
        if (countNew == 0 && countInProgress == 0 && countDone > 0) newObj.statusTask = arrConst[2];

        mapEpic.put(idEpic, newObj);
    }

    public void updateSubtask(Subtask newObj, int idTask) {
        listSubtask.set(idTask, newObj);
    }

    public void printAllSubtaskFromConcretEpic(Epic obj, int idEpic) {
        for (Subtask st : listSubtask) {
            if (st.idTask == obj.idTask) {
                System.out.println(st);
            }
        }
    }
}
