package models;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public ProjectSnapshot createSnapshot() {
        return new ProjectSnapshot(this, new ArrayList<>(tasks));
    }

    @Override
    public String toString() {
        return "Project{" +
                "tasks=" + tasks +
                '}';
    }
}