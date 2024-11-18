package models;

import java.util.ArrayList;
import java.util.List;

public class Server implements ServerMonitoring {
    private List<AdminObserver> administrators;
    private String serverName;
    private String status;

    public Server(String serverName) {
        this.serverName = serverName;
        this.administrators = new ArrayList<>();
    }

    @Override
    public void registerAdministrator(AdminObserver observer) {
        administrators.add(observer);
    }

    @Override
    public void removeAdministrator(AdminObserver observer) {
        administrators.remove(observer);
    }

    @Override
    public List<String> notifyAdministrators() {
        List<String> notifications = new ArrayList<>();
        for (AdminObserver observer : administrators) {
            String notification = observer.update(serverName, status);
            notifications.add(notification);
        }
        return notifications;
    }

    public void setStatus(String status) {
        this.status = status;
        List<String> notifications = notifyAdministrators();
        for (String notification : notifications) {
            System.out.println(notification);
        }
    }
}