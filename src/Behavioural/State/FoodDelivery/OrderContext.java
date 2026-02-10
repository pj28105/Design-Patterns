package Behavioural.State.FoodDelivery;

/**
 * The Context maintains an instance of a Concrete State
 * that defines the current state.
 */
public class OrderContext {
    private OrderState currentState; // The "Brain" of the current phase
    private final String orderId;
    private final String customerName;

    public OrderContext(OrderState orderState, String orderId, String customerName) {
        this.currentState = orderState;
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // The Context delegates work to the State object
    public void next() {
        this.currentState.next(this);
    }

    public void cancel() {
        this.currentState.cancel(this);
    }

    // Allows Concrete States to trigger a transition to a new State
    public void setState(OrderState orderState) {
        this.currentState = orderState;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getCustomerName() {
        return this.customerName;
    }
}
