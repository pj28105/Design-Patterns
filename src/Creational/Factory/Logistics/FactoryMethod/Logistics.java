package Creational.Factory.Logistics.FactoryMethod;

import Creational.Factory.Logistics.Transport;

public abstract class Logistics {

    /**
     * PILLAR #2: THE FIXED PROCEDURE (Template Method)
     * This method handles the 'Business Logic'. It knows the STEPS,
     * but it doesn't know the concrete OBJECT.
     */
    public void deliver(String transportType) {
        final Transport transport = createTransport(transportType);

        transport.pack();
        transport.transport();
        transport.unpack();
    }

    /**
     * PILLAR #1: THE FACTORY METHOD (The Hook)
     * This is the 'hole' in the class. Subclasses will fill this
     * by deciding which concrete Transport to instantiate.
     */
    abstract public Transport createTransport(String transportType);
}
