package models;

import java.util.List;

public interface ServerMonitoring {
    void registerAdministrator(AdminObserver observer);
    void removeAdministrator(AdminObserver observer);
    List<String> notifyAdministrators();
}