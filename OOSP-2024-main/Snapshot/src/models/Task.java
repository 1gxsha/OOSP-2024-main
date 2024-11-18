package models;

public class Task {
    private String name;
    private String status;

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}