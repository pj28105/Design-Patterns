package Creational.Singleton;

/**
 * The Enum Singleton.
 * Provides the strongest protection against multiple instantiation and Reflection.
 */
public enum EnumSingleton {

    // This is the single instance. It is effectively:
    // public static final EnumSingleton INSTANCE = new EnumSingleton();
    INSTANCE;

    /**
     * Enum constructors are implicitly PRIVATE.
     * You cannot use 'public' here; the JVM ensures no one else can
     * instantiate an enum, making it naturally "Reflection-proof."
     */
    EnumSingleton() {
        // Initialization code goes here
    }

    // You can have fields/properties just like a regular class.
    private final String property = "Property";

    // You can have methods to define behavior.
    public void operation() {
        System.out.println("Executing operation with: " + property);
    }

    // You can also add getters/setters if the state needs to be mutable.
    public String getProperty() {
        return property;
    }
}