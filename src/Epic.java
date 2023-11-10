public class Epic extends Task {
    public Epic(String nameTask, String descriptionTask, int idTask, String statusTask) {
        super(nameTask, descriptionTask, idTask, statusTask);
    }

    @Override
    public String toString() {
        return "Epic{" +
                "nameTask='" + nameTask + '\'' +
                ", DescriptionTask='" + DescriptionTask + '\'' +
                ", idTask=" + idTask +
                ", statusTask='" + statusTask + '\'' +
                '}';
    }
}
