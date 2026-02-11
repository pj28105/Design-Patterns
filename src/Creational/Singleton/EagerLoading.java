package Creational.Singleton;

/**
 * Eager Loading Singleton (also known as Static Initialization).
 * The instance is created as soon as the class is loaded into memory.
 */
public class EagerLoading {

    // Because this is a static initializer, the JVM guarantees thread safety
    // during the creation of this instance.
    private static final EagerLoading instance = new EagerLoading();

    // Private constructor prevents instantiation from other classes.
    private EagerLoading() {
    }

    public static EagerLoading getInstance() {
        return instance;
    }
}
