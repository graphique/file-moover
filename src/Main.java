import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String separator = File.separator;
        Launch launch = new Launch();
        String yourFolder = "pics";
        String username = "sergeyisw";
        String extension = ".png";
        launch.launchMooving(separator,username,extension,yourFolder);

    }

}



