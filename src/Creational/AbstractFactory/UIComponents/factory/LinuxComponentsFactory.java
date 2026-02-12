package Creational.AbstractFactory.UIComponents.factory;

import Creational.AbstractFactory.UIComponents.Button;
import Creational.AbstractFactory.UIComponents.LinuxButton;
import Creational.AbstractFactory.UIComponents.LinuxScrollbar;
import Creational.AbstractFactory.UIComponents.Scrollbar;

/**
 * Concrete Factory for Linux.
 * It produces a family of products that are compatible with Linux.
 */
public class LinuxComponentsFactory implements ComponentsFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new LinuxScrollbar();
    }
}
