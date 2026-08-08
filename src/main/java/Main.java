import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TaskManager tasks;
        TaskStorage storage = new TaskStorage("tasks.txt");
        tasks = new TaskManager(storage);

        UserInterface textUI = new UserInterface(scan, tasks);
        textUI.start();
    }
}
