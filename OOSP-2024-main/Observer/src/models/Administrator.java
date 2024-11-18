package models;

public class Administrator implements AdminObserver {
    private String name;

    public Administrator(String name) {
        this.name = name;
    }

    public String update(String serverName, String status) {
        return "Alert for " + name + ": Server " + serverName + " is now " + status;
    }
}