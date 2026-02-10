package Behavioural.State.FoodDelivery;

public class DeliveredState implements OrderState {

    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Order can't be modified once delivered");
    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Order can't be cancelled once delivered");
    }
}
