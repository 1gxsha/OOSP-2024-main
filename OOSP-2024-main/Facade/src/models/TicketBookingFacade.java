package models;

public class TicketBookingFacade {
    private FlightSearch flightSearch;
    private SeatSelection seatSelection;
    private PaymentProcessing paymentProcessing;

    public TicketBookingFacade() {
        flightSearch = new FlightSearch();
        seatSelection = new SeatSelection();
        paymentProcessing = new PaymentProcessing();
    }

    public void bookTicket(String origin, String destination, String seatPreference, double amount) {
        String flightNumber = flightSearch.searchFlights(origin, destination);
        String seatNumber = seatSelection.selectSeat(flightNumber, seatPreference);
        boolean paymentStatus = paymentProcessing.processPayment(flightNumber, seatNumber, amount);

        if (paymentStatus) {
            System.out.println("Ticket successfully booked!");
        } else {
            System.out.println("Booking failed, please try again.");
        }
    }
}