package Creational.AbstractFactory.UIComponents;

/**
 * Concrete Product/Button For Windows
 */
public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Windows Button clicked!");
    }
}
