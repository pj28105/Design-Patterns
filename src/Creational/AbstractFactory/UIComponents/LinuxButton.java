package Creational.AbstractFactory.UIComponents;

/**
 * Concrete Product/Button For Linux
 */
public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Linux Button clicked!");
    }
}
