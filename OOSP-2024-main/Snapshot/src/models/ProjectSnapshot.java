package models;

import java.util.List;

public class ProjectSnapshot {
    private Project project;
    private List<Task> tasks;

    public ProjectSnapshot(Project project, List<Task> tasks) {
        this.project = project;
        this.tasks = tasks;
    }

    public void restoreProject() {
        project.getTasks().clear();
        project.getTasks().addAll(tasks);
    }
}