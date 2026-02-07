package Structural.Adapter.PaymentGateway;

/*
    Common interface that all payment providers are adapted to.
    Acts as the Target Interface in the Adapter pattern.
*/

public interface PaymentGateway {

    void processPayment(String bankAccountNumber, double amount);
}
