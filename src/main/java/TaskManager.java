import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> taskList;
    private final TaskStorage storage;

    public TaskManager(TaskStorage storage) {
        this.taskList = new ArrayList<>(storage.load());
        this.storage = storage;
    }

    public void add(Task task) {
        this.taskList.add(task);
        save();
    }


    public void listTask() {
        for (int i = 0; i < this.taskList.size(); i++) {
            System.out.println(i + 1 + ": " + this.taskList.get(i).toString());
        }
    }

    public void delete(int num) {
        num--;
        if (num < 0 || num >= this.taskList.size()) {
            return;
        }
        this.taskList.remove(num);
        save();
    }

    public void markDone(int num) {
        num--;
        if (num < 0 || num >= this.taskList.size()) {
            return;
        }
        this.taskList.get(num).setStatus(Status.COMPLETED);
        save();
    }

    public void markProgress(int num) {
        num--;
        if (num < 0 || num >= this.taskList.size()) {
            return;
        }
        this.taskList.get(num).setStatus(Status.IN_PROGRESS);
        save();
    }

    public void save() {
        this.storage.save(this.taskList);
    }

}
