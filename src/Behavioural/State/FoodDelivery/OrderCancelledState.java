package Behavioural.State.FoodDelivery;

public class OrderCancelledState implements OrderState {

    @Override
    public void next(final OrderContext orderContext) {
        System.out.println("Order is cancelled and can't be modified");
    }

    @Override
    public void cancel(final OrderContext orderContext) {
        System.out.println("Order is already cancelled");
    }
}
