package Creational.Factory.Logistics;

public class Train implements Transport {

    @Override
    public void pack() {
        System.out.println("Packing logistics onto Train");
    }

    @Override
    public void transport() {
        System.out.println("Transporting logistics via Train");
    }

    @Override
    public void unpack() {
        System.out.println("Unpacking logistics from Train");
    }
}
