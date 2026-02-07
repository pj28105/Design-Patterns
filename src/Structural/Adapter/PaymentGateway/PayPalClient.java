package Structural.Adapter.PaymentGateway;

/*
    Third party PayPal API which can't be modified.

    Processing payment via PayPal requires an API key.

    Its interface is incompatible with PaymentGateway, so it must be wrapped by an adapter.
*/

public class PayPalClient {

    public void payWithPayPal(final String ApiKey,
                       final String bankAccountNumber,
                       final double amount) {

        System.out.println("Processing Payment With PayPal.payWithPayPal() for amount " + amount
                + " with bankAccountNumber " + bankAccountNumber
                + " and API key " + ApiKey);
    }
}
