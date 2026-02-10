package Behavioural.State.FoodDelivery;

/**
 * The State interface defines the actions that can be performed.
 * Each Concrete State will implement these methods differently.
 */
public interface OrderState {
    // Defines how to move to the subsequent stage
    void next(OrderContext orderContext);

    // Defines the rules for abandoning the process at this specific stage
    void cancel(OrderContext orderContext);
}