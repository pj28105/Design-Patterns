package Structural.Bridge.FileArchiver;

/**
 * In the Bridge pattern, the Client's only job is to pick which
 * Abstraction (Archiver) should be paired with which Implementation (FileSystem).
 */
public class Client {

    public static void main(String[] args) {

        // Example 1
        final WindowsFileSystem windowsFileSystem = new WindowsFileSystem();

        // We "plug in" the Windows implementation into the Archiver abstraction.
        // This 'injection' is where the Bridge is formed.
        final FastFileArchiver windowsFastFileArchiver = new FastFileArchiver(windowsFileSystem);

        // This calls high-level logic (FastArchiver), which then delegates
        // the low-level work to the Bridge (WindowsFileSystem).
        windowsFastFileArchiver.archive("FILE_FOR_WINDOWS");

        // Example 2
        final LinuxFileSystem linuxFileSystem = new LinuxFileSystem();

        // Notice we use a DIFFERENT Archiver (Deep) with a DIFFERENT OS (Linux).
        // Because of the Bridge, DeepFileArchiver doesn't need to know Linux specifics.
        final DeepFileArchiver deepFileArchiver  = new DeepFileArchiver(linuxFileSystem);

        // Deep Archive and Save File In Linux
        deepFileArchiver.archive("FILE_FOR_LINUX");
    }
}
