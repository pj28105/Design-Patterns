package Creational.Factory.Logistics.FactoryMethod;

import Creational.Factory.Logistics.Train;
import Creational.Factory.Logistics.Transport;
import Creational.Factory.Logistics.Truck;

/**
 * CONCRETE CREATOR: Specializes in Ground transport.
 */
public class GroundTransport extends Logistics {

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
         * TruckTransport, TrainTransport, VanTransport, etc.
         */
        if (transportType.equals("Train")) {
            return new Train();
        } else if (transportType.equals("Truck")) {
            return new Truck();
        }
        throw new IllegalArgumentException(transportType + " is not supported");
    }
}
