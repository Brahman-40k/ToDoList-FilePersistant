import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private final Path filePath;

    public TaskStorage(String fileName) {
        this.filePath = Path.of(fileName);
    }

    public void save(List<Task> tasks) {
        List<String> lines = new ArrayList<>();

        for (Task task : tasks) {
            String line = String.format("%s,%s,%s,%s"
                    , task.getId()
                    , task.getDescription()
                    , task.getStatus().name()
                    , task.getDate());
            lines.add(line);
        }

        try {
            Files.write(this.filePath, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Task> load() {
        List<Task> tasks = new ArrayList<>();

        if (!Files.exists(this.filePath)) {
            return tasks;
        }
        try {
            List<String> lines = Files.readAllLines(this.filePath);

            for (String line : lines) {
                if (line.isEmpty()) continue;

                String[] parts = line.split(",", 4);
                String id = parts[0];
                String description = parts[1];
                String status = parts[2];
                LocalDate date = LocalDate.parse(parts[3]);
                Task task = new Task(id, description, date);
                task.setStatus(Status.valueOf(status));
                tasks.add(task);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return tasks;
    }


}
