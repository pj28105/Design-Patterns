package Structural.Adapter.PaymentGateway;

import java.util.List;

/*
   Client depends only on the PaymentGateway abstraction.

   Concrete gateways are adapted behind the scenes, so the client stays decoupled from vendor-specific APIs.
*/

public class Client {

    public static void main(String[] args) {
        final String clientBankAccountNumber = "BK1212";
        final double amount = 9.99;

        final List<PaymentGateway> paymentGateways = getPaymentGateways();

        paymentGateways.forEach(paymentGateway -> {
            paymentGateway.processPayment(clientBankAccountNumber, amount);
        });
    }

    static List<PaymentGateway> getPaymentGateways() {
        final PayPalClient payPalClient = new PayPalClient();
        final PayPalAdapter payPalAdapter = new PayPalAdapter(payPalClient);

        final RazorPayClient razorPayClient = new RazorPayClient();
        final RazorPayAdapter razorPayAdapter = new RazorPayAdapter(razorPayClient);

        return List.of(razorPayAdapter, payPalAdapter);
    }
}
