package Structural.Bridge.FileArchiver;

public class FastFileArchiver extends Archiver {

    public FastFileArchiver(final FileSystem fileSystem) {
        super(fileSystem);
    }

    @Override
    public void archive(final String fileName) {
        System.out.println("Archiving " + fileName + " with FastFileArchiver");
        fileSystem.writeFile(fileName, ".rar");
    }
}
