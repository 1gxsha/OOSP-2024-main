import adapters.PayPalAdapter;
import adapters.StripeAdapter;
import adapters.SquareAdapter;
import models.NewPayPal;
import models.NewStripe;
import models.NewSquare;

public class Main {
    public static void main(String[] args) {
        NewPayPal newPayPal = new NewPayPal();
        NewStripe newStripe = new NewStripe();
        NewSquare newSquare = new NewSquare();

        PayPalAdapter payPalAdapter = new PayPalAdapter(newPayPal);
        StripeAdapter stripeAdapter = new StripeAdapter(newStripe);
        SquareAdapter squareAdapter = new SquareAdapter(newSquare);

        System.out.println(payPalAdapter.processPayment());
        System.out.println(stripeAdapter.processPayment());
        System.out.println(squareAdapter.processPayment());
    }
}