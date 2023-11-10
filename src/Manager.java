import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Manager {
    int countTask;
    int countEpic;
    int countSubtask;
    HashMap<Integer, Task> mapTask = new HashMap<>();
    HashMap<Integer, Epic> mapEpic = new HashMap<>();
    ArrayList<Subtask> listSubtask = new ArrayList<>();

    public void creatAndAddTaskToMap(Task newObj) {
        ++countTask;
        mapTask.put(countTask, newObj);
    }

    public void creatAndAddEpicToMap(Epic newObj) {
        ++countEpic;
        mapEpic.put(countEpic, newObj);
    }

    public void creatAndAddSubtaskToList(Subtask newObj) {
        ++countSubtask;
        listSubtask.add(countSubtask, newObj);
    }

    public void printTaskMap(HashMap<Integer, Task> map) {
        for (Map.Entry<Integer, Task> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Task value = entry.getValue();
            System.out.println("Задача с идентификатором " + key + ": " + value);
        }
    }

    public void printEpicMap(HashMap<Integer, Epic> map) {
        for (Map.Entry<Integer, Epic> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Epic value = entry.getValue();
            System.out.println("Эпик с идентификатором " + key + ": " + value);
        }
    }

    public void printSubtaskList(ArrayList<Subtask> list) {
        for (Subtask obj : list) {
            System.out.println("Подзадача с идентификатором " + obj.idTask + ": " + obj);
        }
    }

    public void delateAllTask(HashMap<Integer, Task> map) {
        map.clear();
    }

    public void delateAllEpic(HashMap<Integer, Epic> map) {
        map.clear();
    }

    public void delateAllSubtask(ArrayList<Subtask> list) {
        list.clear();
    }

    public Task getTaskById(HashMap<Integer, Task> map, int idTask) {
        return map.get(idTask);
    }

    public Epic getEpicById(HashMap<Integer, Epic> map, int idEpic) {
        return map.get(idEpic);
    }

    public Subtask getSubtaskById(ArrayList<Subtask> list, int idSubtask) {
        for (Subtask obj : list) {
            if (obj.idTask == idSubtask) return obj;
        }
        System.out.println("С таким id подзадач нет");
        return null;
    }

    public void delateTaskById(HashMap<Integer, Task> map, int idTask) {
        map.remove(idTask);
    }

    public void delateEpicById(HashMap<Integer, Epic> map, int idEpic) {
        map.remove(idEpic);
    }

    public void delateSubtaskById(ArrayList<Subtask> list, int idSubtask) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).idTask == idSubtask) list.remove(i);
        }
    }

    public void updateTask(Task newObj, int idTask) {
        mapTask.replace(idTask, mapTask.get(idTask), newObj);
    }
}
