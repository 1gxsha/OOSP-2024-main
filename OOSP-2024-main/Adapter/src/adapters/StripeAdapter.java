package adapters;

import models.NewStripe;
import models.PaymentGateway;

public class StripeAdapter implements PaymentGateway {
    private NewStripe newStripe;

    public StripeAdapter(NewStripe newStripe) {
        this.newStripe = newStripe;
    }

    @Override
    public String processPayment() {
        return newStripe.charge();
    }
}