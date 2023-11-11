public class Subtask extends Task {
    public Subtask(String nameTask, String descriptionTask, int idTask, String statusTask) {
        super(nameTask, descriptionTask, idTask, statusTask);
    }

    @Override
    public String toString() {
        return "Название подзадачи: " + nameTask +
                ", Описание подзадачи: " + descriptionTask +
                ", Id подзадачи: " + idTask +
                ", Статус подзадачи: " + statusTask;
    }
}
