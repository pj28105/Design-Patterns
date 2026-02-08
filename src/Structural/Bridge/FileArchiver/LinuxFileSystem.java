package Structural.Bridge.FileArchiver;

public class LinuxFileSystem implements FileSystem {

    @Override
    public void writeFile(String fileName, String fileExtension) {
        System.out.println("Writing " + fileName + " to LinuxFileSystem " +
                "with extension " + fileExtension);
    }
}
