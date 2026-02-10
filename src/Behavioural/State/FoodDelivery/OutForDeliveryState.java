package Behavioural.State.FoodDelivery;

public class OutForDeliveryState implements OrderState {

    @Override
    public void next(OrderContext orderContext) {
        System.out.printf(
                "Order with id:%s and customerName:%s has been delivered\n",
                orderContext.getOrderId(),
                orderContext.getCustomerName());

        orderContext.setState(new DeliveredState());
    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Order can't be cancelled once it is out for delivery");
    }
}
