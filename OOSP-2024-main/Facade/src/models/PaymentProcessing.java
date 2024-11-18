package models;

public class PaymentProcessing {
    public boolean processPayment(String flightNumber, String seatNumber, double amount) {
        System.out.println("Processing payment for flight " + flightNumber + ", seat " + seatNumber + ", amount $" + amount);
        return true;
    }
}