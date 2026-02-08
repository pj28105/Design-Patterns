package Structural.Bridge.FileArchiver;

/**
 * THE ABSTRACTION (The "What" Pillar)
 * * This is an abstract class because it doesn't represent a complete product,
 * but rather the base template for all types of Archivers.
 */
public abstract class Archiver {

    /**
     * THE BRIDGE FIELD:
     * This is the most important line. Instead of inheriting from a
     * FileSystem, we COMPOSE it. This reference is the physical "Bridge"
     * that connects this hierarchy to the FileSystem hierarchy.
     */
    protected FileSystem fileSystem;

    /**
     * THE INJECTION CONSTRUCTOR:
     * This allows the Client to "plug in" any OS-specific implementation
     * (Windows, Linux, etc.) at runtime.
     */
    public Archiver(final FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * HIGH-LEVEL OPERATION:
     * This defines the "Business Logic" the user cares about.
     * Specific subclasses (FastArchiver, DeepArchiver) will implement this.
     */
    public abstract void archive(final String fileName);
}