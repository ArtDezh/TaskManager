public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.creatAndAddTaskToMap(new Task("Clean my car", "My car is very dirty",
                1, "NEW"));
        m1.creatAndAddTaskToMap(new Task("The rest", "I'm very tired",
                2, "NEW"));

        m1.creatAndAddEpicToMap(new Epic("Wash my car", "I need some shampoo, water, car and sponge",
                1, "NEW"));

        m1.creatAndAddSubtaskToList(new Subtask("Wash my car", "Take some shampoo and water",
                1, "IN_PROGRESS"));
        m1.creatAndAddSubtaskToList(new Subtask("Wash my car", "Take car and sponge",
                1, "NEW"));

        m1.creatAndAddEpicToMap(new Epic("Watch TV", "I need remote, beer and pizza",
                2, "NEW"));

        m1.creatAndAddSubtaskToList(new Subtask("Watch TV", "I brought remote and beer, but I'm waiting my pizza",
                2, "IN_PROGRESS"));

        m1.printTaskMap();
        m1.printEpicMap();
        m1.printSubtaskList();

        m1.updateTask(new Task("Clean my car", "My car is dirty yet",
                1, "IN_PROGRESS"), 1);
        m1.updateTask(new Task("The rest", "I'm very tired",
                2, "IN_PROGRESS"), 2);

        m1.updateEpic(new Epic("Wash my car", "I need some shampoo, water, car and sponge",
                1, "NEW"), 1);
        m1.updateEpic(new Epic("Watch TV", "I need remote, beer and pizza",
                2, "NEW"), 2);

        m1.updateSubtask(new Subtask("Wash my car", "Take some shampoo and water",
                1, "IN_PROGRESS"), 1);
        m1.updateSubtask(new Subtask("Wash my car", "Take car and sponge",
                1, "NEW"), 1);
        m1.updateSubtask(new Subtask("Watch TV", "I got all things, that I needed",
                2, "DONE"), 2);

        m1.printTaskMap();
        m1.printEpicMap();
        m1.printSubtaskList();

        m1.delateTaskById(1);
        m1.delateEpicById(2);
    }
}