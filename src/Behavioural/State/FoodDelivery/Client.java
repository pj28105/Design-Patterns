package Behavioural.State.FoodDelivery;

public class Client {

    public static void main(String[] args) {
        simulateSuccessfulOrder();
        System.out.println("#######################################");

        simulateCancelledOrder();
        System.out.println("#######################################");

        simulateFailedCancellation();
        System.out.println("#######################################");
    }

    static void simulateSuccessfulOrder() {
        final OrderContext order = createOrderContext("A");
        order.next();
        order.next();
        order.next();
    }


    static void simulateCancelledOrder() {
        final OrderContext order = createOrderContext("B");
        order.cancel();
    }

    static void simulateFailedCancellation() {
        final OrderContext order = createOrderContext("C");
        order.next();
        order.cancel();
        order.next();
        order.cancel();
        order.next();
        order.cancel();
    }

    static OrderContext createOrderContext(String customerName) {
        return new OrderContext(
                new OrderPlacedState(),
                String.valueOf((int)(Math.random() * 100)),
                customerName);
    }
}
