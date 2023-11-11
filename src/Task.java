public class Task {
    protected String nameTask;
    protected String descriptionTask;
    protected int idTask;
    protected String statusTask;

    public Task(String nameTask, String descriptionTask, int idTask, String statusTask) {
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
        this.idTask = idTask;
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        return "Название задачи: " + nameTask +
                ", Описание задачи: " + descriptionTask +
                ", Id задачи: " + idTask +
                ", Статус задачи: " + statusTask;
    }
}
