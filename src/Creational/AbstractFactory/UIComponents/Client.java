package Creational.AbstractFactory.UIComponents;

import Creational.AbstractFactory.UIComponents.factory.ComponentsFactory;
import Creational.AbstractFactory.UIComponents.factory.LinuxComponentsFactory;
import Creational.AbstractFactory.UIComponents.factory.WindowsComponentsFactory;

public class Client {

    public static void main(String[] args) {
        // We simulate a cross-platform environment by looping through OS types
        for (int i = 0; i < 2; ++i) {
            // 1. Get the factory instance (The client is blind to the concrete implementation)
            final ComponentsFactory factory = resolveEnvironmentFactory(i);

            // 2. Use the factory to create a FAMILY of related objects
            // The client never calls 'new WindowsButton()' directly.
            final Button button = factory.createButton();
            final Scrollbar scrollbar = factory.createScrollBar();

            // 3. Execute logic on the abstract interfaces
            // Note: Client only knows abstract interfaces
            // it doesn't know the concrete impl underneath
            scrollbar.scroll();
            button.click();
            System.out.println("#####################################");
        }
    }

    /**
     * A dummy function to decide which Abstract Factory
     * implementation to use based on the environment/configuration.
     */
    public static ComponentsFactory resolveEnvironmentFactory(int val) {
        if (val % 2 == 0) {
            return new WindowsComponentsFactory();
        }
        return new LinuxComponentsFactory();
    }
}
