public class Epic extends Task {
    public Epic(String nameTask, String descriptionTask, int idTask, String statusTask) {
        super(nameTask, descriptionTask, idTask, statusTask);
    }

    @Override
    public String toString() {
        return "Название эпика: " + nameTask +
                ", Описание эпика: " + descriptionTask +
                ", Id эпика: " + idTask +
                ", Статус эпика: " + statusTask;
    }
}
