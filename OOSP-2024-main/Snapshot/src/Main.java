import models.Command;
import models.Project;
import models.Task;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        Command command = new Command();

        Task task1 = new Task("Task 1", "in progress");
        Task task2 = new Task("Task 2", "pending");

        project.addTask(task1);
        project.addTask(task2);

        command.makeBackup(project);

        System.out.println(project);

        task1.setStatus("completed");

        System.out.println(project);

        command.undo();

        System.out.println(project);
    }
}