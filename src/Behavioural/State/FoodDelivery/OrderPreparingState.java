package Behavioural.State.FoodDelivery;

/**
 * Concrete States implement behavior associated with a state of the Context.
 */
public class OrderPreparingState implements OrderState {

    @Override
    public void next(final OrderContext orderContext) {
        // State-specific business logic
        System.out.printf("Handing over order %s to delivery partner...%n", orderContext.getOrderId());

        // Transition: The state itself decides what the next step is
        orderContext.setState(new OutForDeliveryState());
    }

    @Override
    public void cancel(final OrderContext orderContext) {
        // Guard Logic: This state restricts certain actions
        System.out.println("Wait! The chef already started. Cancellation is no longer possible.");
    }
}
