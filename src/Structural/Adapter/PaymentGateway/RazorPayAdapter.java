package Structural.Adapter.PaymentGateway;

/*
    RazorPayAdapter implements target client interface i.e. PaymentGateway.

    Internally, it translates request for Razorpay and processes payments.
 */

public class RazorPayAdapter implements PaymentGateway {

    private final RazorPayClient razorPayClient;

    public RazorPayAdapter(final RazorPayClient razorPayClient) {
        this.razorPayClient = razorPayClient;
    }

    @Override
    public void processPayment(final String bankAccountNumber, final double amount) {
        razorPayClient.payWithRazorPay(bankAccountNumber, amount);
    }
}
