package adapters;

import models.NewSquare;
import models.PaymentGateway;

public class SquareAdapter implements PaymentGateway {
    private NewSquare newSquare;

    public SquareAdapter(NewSquare newSquare) {
        this.newSquare = newSquare;
    }

    @Override
    public String processPayment() {
        return newSquare.process();
    }
}