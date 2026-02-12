package Creational.AbstractFactory.UIComponents;

/**
 * Concrete Product/Scrollbar For Linux
 */
public class LinuxScrollbar implements Scrollbar {

    @Override
    public void scroll() {
        System.out.println("Linux Scrollbar scrolled!");
    }
}
