import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String separator = File.separator;
        String username = "sergeyisw"; //сделать чтобы подсасывал юзернейм компа
        String path =   "Users" + separator + username + separator +"Desktop";
        File destinationFolder = new File(path +"\\b2g");
        File sourceFolder = new File(path);

        Ext ext = new Ext();
        Move move = new Move();

        File[] listOfFiles = sourceFolder.listFiles();
        List <File> newList = new ArrayList<File>();

        if (listOfFiles != null) {

            for (File file : listOfFiles) {
                System.out.println("the file name is " + file.getName());
            }

            for (File baby: listOfFiles) {
                if (ext.getFileExtension(baby).equals(".png")) {
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



