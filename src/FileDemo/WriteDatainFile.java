package FileDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteDatainFile {
    public static  void main(String[] args) throws IOException {
        String fname = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\demo\\log_2282022.txt";
        File dir = new File(fname);
        dir.createNewFile();
        FileWriter mywriter = new FileWriter(dir, true );
       // Date d = new Date();
        //String currentTime = String.valueOf(d.getTime());

        mywriter.write("Message come here");
        mywriter.close();

    }
}
