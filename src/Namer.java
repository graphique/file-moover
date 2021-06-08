
import java.text.SimpleDateFormat;
import java.util.Date;

public class Namer {

public String getRanDomName () {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm");

    Date date = new Date();
    simpleDateFormat.format(date);


    String value = "moved file " + date  ;
    return value;
    }

    //date time formatter
}
