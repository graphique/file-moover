import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Move {

   String separator = File.separator;
   Namer namer = new Namer();

    public  void moveFiles(File destinationFolder, File sourceFolder, List<File> newList) {

        if (!destinationFolder.exists()) {
            System.out.println("destination folder does not exist");
        }
        // Check weather source exists and it is folder.
        if (sourceFolder.exists() && sourceFolder.isDirectory()) {
            // Get list of the files and iterate over them

            if (newList != null) {
                for (File child : newList) {
                    // Move files to destination folder
                    child.renameTo(new File(destinationFolder + separator + " " + namer.getRanDomName() + child.getName()));
                }
            }
        } else {
            System.out.println(sourceFolder + "  Folder does not exists");
        }
    }
}
