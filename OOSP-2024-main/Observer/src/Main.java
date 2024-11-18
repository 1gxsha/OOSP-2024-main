import models.Server;
import models.Administrator;

public class Main {
    public static void main(String[] args) {
        Server server1 = new Server("Server1");

        Administrator admin1 = new Administrator("Alice");
        Administrator admin2 = new Administrator("Bob");

        server1.registerAdministrator(admin1);
        server1.registerAdministrator(admin2);

        // Simulate server status changes
        server1.setStatus("Overloaded");
        server1.setStatus("Down");
    }
}