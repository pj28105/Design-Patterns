package Creational.Factory.Logistics;

/**
 * THE PRODUCT: This is the common interface for all things that can be moved.
 * All concrete products (Truck, Train, Ship) MUST follow this contract.
 */
public interface Transport {

    void pack();
    void transport();
    void unpack();
}
