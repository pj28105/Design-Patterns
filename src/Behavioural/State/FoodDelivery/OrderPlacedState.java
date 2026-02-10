package Behavioural.State.FoodDelivery;

public class OrderPlacedState implements OrderState {

    @Override
    public void next(final OrderContext orderContext) {
        System.out.printf("Sending order with id:%s to kitchen for preparation%n",
                orderContext.getOrderId());

        orderContext.setState(new OrderPreparingState());
    }

    @Override
    public void cancel(final OrderContext orderContext) {
        System.out.printf(
                "Cancelling order with id:%s and customerName:%s%n",
                orderContext.getOrderId(),
                orderContext.getCustomerName());

        orderContext.setState(new OrderCancelledState());
    }
}
