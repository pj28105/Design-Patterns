package Creational.Factory.Logistics;

import Creational.Factory.Logistics.FactoryMethod.GroundTransport;
import Creational.Factory.Logistics.FactoryMethod.SeaTransport;
import Creational.Factory.Logistics.SimpleFactory.SimpleTransportFactory;

public class Client {

    public static void main(String[] args) {
        executeSimpleFactory();
        System.out.println("#################################");
        executeFactoryMethod();
    }

    public static void executeSimpleFactory() {
        final Transport transport = SimpleTransportFactory.createTransport("Truck");
        transport.pack();
        transport.transport();
        transport.unpack();
    }

    public static void executeFactoryMethod() {
        // CHOICE: Pick the category (Subclass) and the variation (String)
        final GroundTransport groundTransport = new GroundTransport();

        /*
        * ADVANTAGE OVER SimpleFactory: PROCEDURE LOCKING
         * The Client calls 'deliver', but the Parent Class controls the
         * order of Pack -> Transport -> Unpack.
         * The client can't skip a step or do them out of order.
         */
        groundTransport.deliver("Train");
        final SeaTransport seaTransport = new SeaTransport();
        seaTransport.deliver("Ship");
    }
}
