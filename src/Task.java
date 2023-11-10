public class Task {
    protected String nameTask;
    protected String DescriptionTask;
    protected int idTask;
    protected String statusTask;

    public Task(String nameTask, String descriptionTask, int idTask, String statusTask) {
        this.nameTask = nameTask;
        DescriptionTask = descriptionTask;
        this.idTask = idTask;
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "nameTask='" + nameTask + '\'' +
                ", DescriptionTask='" + DescriptionTask + '\'' +
                ", idTask=" + idTask +
                ", statusTask='" + statusTask + '\'' +
                '}';
    }
}
