package Creational.Singleton;

/**
 * The Bill Pugh Singleton (Initialization-on-demand holder idiom).
 * This is the most recommended way to implement a lazy-loaded Singleton.
 */
public class BillPugh {

    // Private constructor prevents instantiation from other classes.
    private BillPugh() {
    }

    /**
     * The Inner Class is the key.
     * In Java, an inner class is NOT loaded into memory when the outer class
     * is loaded. It is only loaded when it is specifically referenced.
     */
    private static class Holder {
        // The JVM guarantees that static class initialization is thread-safe.
        // This 'instance' is created only when Holder is accessed for the first time.
        private static final BillPugh instance = new BillPugh();
    }

    /**
     * When this method is called, the JVM loads the 'Holder' class,
     * executes the static initializer, and creates the instance.
     */
    public static BillPugh getInstance() {
        return Holder.instance;
    }
}
