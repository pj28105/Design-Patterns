package Structural.Adapter.PaymentGateway;

/*
    PayPalAdapter implements target client interface i.e. PaymentGateway.

    Internally, it translates request for PayPal and processes payments.
 */

public class PayPalAdapter implements PaymentGateway {

    private final PayPalClient payPalClient;

    private static final String PAYPAL_API_KEY = "PAYPAL:12345";

    public PayPalAdapter(final PayPalClient payPalClient) {
        this.payPalClient = payPalClient;
    }

    @Override
    public void processPayment(String bankAccountNumber, double amount) {
        payPalClient.payWithPayPal(PAYPAL_API_KEY, bankAccountNumber, amount);
    }
}
