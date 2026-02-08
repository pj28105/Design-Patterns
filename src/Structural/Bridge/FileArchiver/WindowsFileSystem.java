package Structural.Bridge.FileArchiver;

public class WindowsFileSystem implements FileSystem {

    @Override
    public void writeFile(String fileName, String fileExtension) {
        System.out.println("Writing " + fileName + " to WindowsFileSystem " +
                "with extension " + fileExtension);
    }
}
