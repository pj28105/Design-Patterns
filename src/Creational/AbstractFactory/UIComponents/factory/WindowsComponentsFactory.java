package Creational.AbstractFactory.UIComponents.factory;

import Creational.AbstractFactory.UIComponents.Button;
import Creational.AbstractFactory.UIComponents.Scrollbar;
import Creational.AbstractFactory.UIComponents.WindowsButton;
import Creational.AbstractFactory.UIComponents.WindowsScrollbar;

/**
 * Concrete Factory for Windows.
 * It produces a family of products that are compatible with Windows.
 */
public class WindowsComponentsFactory implements ComponentsFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new WindowsScrollbar();
    }
}
