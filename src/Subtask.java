public class Subtask extends Task {
    public Subtask(String nameTask, String descriptionTask, int idTask, String statusTask) {
        super(nameTask, descriptionTask, idTask, statusTask);
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "nameTask='" + nameTask + '\'' +
                ", DescriptionTask='" + DescriptionTask + '\'' +
                ", idTask=" + idTask +
                ", statusTask='" + statusTask + '\'' +
                '}';
    }
}
