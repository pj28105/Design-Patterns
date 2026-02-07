package Structural.Adapter.PaymentGateway;

/*
    Third party RazorPay API which can't be modified.

    Its interface is incompatible with PaymentGateway, so it must be wrapped by an adapter.
*/

public class RazorPayClient {

    public void payWithRazorPay(final String bankAccountNumber, final double amount) {

        System.out.println("Processing Payment With RazorPay.payWithRazorPay() for amount " + amount
                + " with bankAccountNumber " + bankAccountNumber);
    }
}
