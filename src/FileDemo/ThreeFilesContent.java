package FileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeFilesContent {

    public static void main(String[] args) throws FileNotFoundException {

        String fname = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\demo";
        File dir = new File(fname);
        String[] allFile = dir.list(); // return an array of String
      //  System.out.println(Arrays.toString(allFile));

        for(int i=0; i < allFile.length ; i++)
        {
            File file = new File("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\demo\\" + allFile[i]);
            //System.out.println(file.getAbsolutePath());
            if(file.exists())
            {
                Scanner sc = new Scanner(file);
                String data = "";
                while(sc.hasNext())
                {
                    data += sc.nextLine();
                }
                System.out.println(data);
            }

        }

    }
}
