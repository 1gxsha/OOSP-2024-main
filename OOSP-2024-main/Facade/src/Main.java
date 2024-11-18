import models.TicketBookingFacade;

public class Main {
    public static void main(String[] args) {
        TicketBookingFacade bookingFacade = new TicketBookingFacade();
        bookingFacade.bookTicket("New York", "Los Angeles", "Window", 299.99);
    }
}