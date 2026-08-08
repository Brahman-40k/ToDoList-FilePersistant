import java.time.LocalDate;

public class Task {
    private String id;
    private String description;
    private Status status;
    private LocalDate date;


    public Task(String id, String description, LocalDate date) {
        this.id = id;
        this.description = description;
        this.status = Status.TODO;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "," + description + "," + status + "," + date;
    }
}
