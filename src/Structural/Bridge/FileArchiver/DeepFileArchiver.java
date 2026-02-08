package Structural.Bridge.FileArchiver;

public class DeepFileArchiver extends Archiver {

    public DeepFileArchiver(final FileSystem fileSystem) {
        super(fileSystem);
    }

    @Override
    public void archive(final String fileName) {
        System.out.println("Archiving " + fileName + " with DeepFileArchiver");
        fileSystem.writeFile(fileName, ".zip");
    }
}
