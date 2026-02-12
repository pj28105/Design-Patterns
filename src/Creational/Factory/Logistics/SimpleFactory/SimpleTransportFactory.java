package Creational.Factory.Logistics.SimpleFactory;

import Creational.Factory.Logistics.Ship;
import Creational.Factory.Logistics.Train;
import Creational.Factory.Logistics.Transport;
import Creational.Factory.Logistics.Truck;

public class SimpleTransportFactory {

    public static Transport createTransport(String transportType) {
        return switch (transportType) {
            case "Truck" -> new Truck();
            case "Train" -> new Train();
            case "Ship" -> new Ship();
            default -> throw new IllegalArgumentException(transportType + " is not supported");
        };
    }
}
