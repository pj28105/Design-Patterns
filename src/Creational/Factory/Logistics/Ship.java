package Creational.Factory.Logistics;

public class Ship implements Transport {

    @Override
    public void pack() {
        System.out.println("Packing logistics onto Ship");
    }

    @Override
    public void transport() {
        System.out.println("Transporting logistics via Ship");
    }

    @Override
    public void unpack() {
        System.out.println("Unpacking logistics from Ship");
    }
}
