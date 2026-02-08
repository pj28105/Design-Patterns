package Structural.Bridge.FileArchiver;

/**
 * THE IMPLEMENTOR (The "How" Pillar)
 * This interface defines the primitive operations that all
 * platform-specific classes must provide.
 * * It is kept minimal so that the 'Abstraction' side remains
 * independent of specific platform details.
 */
public interface FileSystem {

    /**
     * NATIVE OPERATION:
     * Concrete classes (Windows, Linux, etc.) will implement the
     * specific logic required for their respective platforms for
     * writing file to disk.
     */
    void writeFile(String fileName, String fileExtension);
}