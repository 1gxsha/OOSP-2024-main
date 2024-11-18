package models;
import java.util.ArrayList;
import java.util.List;

public class Command {
    private ProjectSnapshot backup;

    public void makeBackup(Project project) {
        backup = project.createSnapshot();
    }

    public void undo() {
        if (backup != null) {
            backup.restoreProject();
        }
    }
}