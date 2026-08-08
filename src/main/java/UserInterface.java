import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TaskManager tasks;


    public UserInterface(Scanner scanner, TaskManager tasks) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("--- To-do List ---");
        while (true) {
            System.out.println("""
                    Choose your preferred option:
                    1. Add a task
                    2. List the tasks
                    3. Delete Task
                    4. Task completion
                    5. Task in progress
                    -1. Exit""");
            int input = 1;
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
            if (input == -1) {
                break;
            }
            if (input == 1) {
                System.out.println("Enter Task name:");
                String id = scanner.nextLine();
                System.out.println("Enter Task Description:");
                String description = scanner.nextLine();
                this.tasks.add(new Task(id, description, LocalDate.now()));
            }
            if (input == 2) {
                tasks.listTask();
            }
            if (3 == input) {
                System.out.println("Which task to delete:");
                int num = Integer.parseInt(scanner.nextLine());
                this.tasks.delete(num);
            }
            if (input == 4) {
                System.out.println("Which task to mark as complete:");
                int num = Integer.parseInt(scanner.nextLine());
                this.tasks.markDone(num);
            }
            if (input == 5) {
                System.out.println("Which task to mark as in progress:");
                int num = Integer.parseInt(scanner.nextLine());
                this.tasks.markProgress(num);
            }
        }
    }

}
