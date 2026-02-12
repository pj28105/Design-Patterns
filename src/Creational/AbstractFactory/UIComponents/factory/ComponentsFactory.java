package Creational.AbstractFactory.UIComponents.factory;

import Creational.AbstractFactory.UIComponents.Button;
import Creational.AbstractFactory.UIComponents.Scrollbar;

/**
 * The Abstract Factory interface.
 * It declares a set of methods for creating each of the abstract products.
 */
public interface ComponentsFactory {

    // Note: All methods return Abstract Product interfaces (Button, Scrollbar)
    // rather than concrete classes.
    Button createButton();
    Scrollbar createScrollBar();
}
