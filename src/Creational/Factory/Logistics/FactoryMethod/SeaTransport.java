package Creational.Factory.Logistics.FactoryMethod;

import Creational.Factory.Logistics.Ship;
import Creational.Factory.Logistics.Transport;

/**
 * CONCRETE CREATOR: Specializes in Sea transport.
 */
public class SeaTransport extends Logistics {

    @Override
    public Transport createTransport(String transportType) {
        /*
         * HYBRID ALERT: This 'if' statement makes this a "Parameterized Factory Method."
         * It is not 'Pure' because the subclass is acting as a Mini-Simple-Factory.
         * Pure Factory Method would not have a parameter here.
         */
        /* WHY HYBRID?
         * We use a parameter here to avoid 'Class Explosion'.
         * Without this string, we would need separate classes like:
         * ShipTransport, BoatTransport, etc.
         */
        if (transportType.equals("Ship")) {
            return new Ship();
        }
        throw new IllegalArgumentException(transportType + " is not supported");
    }
}
