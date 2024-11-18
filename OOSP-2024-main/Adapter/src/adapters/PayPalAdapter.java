package adapters;

import models.NewPayPal;
import models.PaymentGateway;

public class PayPalAdapter implements PaymentGateway {
    private NewPayPal newPayPal;

    public PayPalAdapter(NewPayPal newPayPal) {
        this.newPayPal = newPayPal;
    }

    @Override
    public String processPayment() {
        return newPayPal.pay();
    }
}
