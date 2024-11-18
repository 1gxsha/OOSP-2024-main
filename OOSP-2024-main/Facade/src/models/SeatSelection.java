package models;

public class SeatSelection {
    public String selectSeat(String flightNumber, String seatPreference) {
        System.out.println("Selecting " + seatPreference + " seat on flight " + flightNumber);
        return "12A";
    }
}