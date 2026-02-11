package Creational.Singleton;

public class DoubleCheckedLocking {

    // This ensures that when the instance is created, all threads see the
    // fully initialized object, not a partially constructed one.
    private static volatile DoubleCheckedLocking instance = null;

    // Private constructor prevents instantiation from other classes.
    private DoubleCheckedLocking() {
    }

    public static DoubleCheckedLocking getInstance() {
        // Optimization: Assign the volatile field to a local variable.
        // Reading a volatile field is expensive; this ensures we only
        // read it once in the common case (where it's already initialized).
        DoubleCheckedLocking result = instance;

        // First check (No locking): If instance is already created,
        // we return it immediately. This avoids the cost of synchronization.
        if (result == null) {

            // Acquire lock: Only one thread can enter this block at a time.
            synchronized (DoubleCheckedLocking.class) {

                // Read the volatile field again inside the lock.
                // A different thread might have initialized it while
                // this thread was waiting for the lock.
                result = instance;

                // Second check: If it's still null, we are officially
                // the first thread to get here.
                if (result == null) {
                    instance = result = new DoubleCheckedLocking();
                }
            }
        }

        // IMPORTANT: We return 'result' (the local variable) instead of 'instance'.
        // This saves one volatile read on every subsequent call, providing
        // a small but measurable performance boost in high-concurrency systems.
        return result;
    }
}
