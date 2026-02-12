package Creational.Factory.Logistics;

public class Truck implements Transport {

    @Override
    public void pack() {
        System.out.println("Packing logistics onto Truck");
    }

    @Override
    public void transport() {
        System.out.println("Transporting logistics via Truck");
    }

    @Override
    public void unpack() {
        System.out.println("Unpacking logistics from Truck");
    }
}
