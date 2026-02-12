package Creational.AbstractFactory.UIComponents;

/**
 * Concrete Product/Scrollbar For Windows
 */
public class WindowsScrollbar implements Scrollbar {

    @Override
    public void scroll() {
        System.out.println("Windows Scrollbar scrolled!");
    }
}
