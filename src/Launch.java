import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Launch {

    Ext ext = new Ext();
    Move move = new Move();

    public void launchMooving (String separator, String username, String extension, String folder) {


        String path =   separator + "Users" + separator + username + separator +"Desktop";
        File destinationFolder = new File(path + separator + folder);

        File sourceFolder = new File(path);



        File[] listOfFiles = sourceFolder.listFiles();
        List<File> newList = new ArrayList<File>();

        if (listOfFiles != null) {

            for (File file : listOfFiles) {
                System.out.println("the file name is " + file.getName());
            }

            for (File baby: listOfFiles) {
                if (ext.getFileExtension(baby).equals(extension)) {
                    newList.add(baby);
                } else {
                    System.out.println("this file is not .png extension");

                }
            }
        }

        if (newList != null) {
            for (File file : newList) {
                System.out.println("file is " + file);
            }

            for (File file : newList) {
                move.moveFiles(destinationFolder, sourceFolder, newList);
            }
        }
     }
}





