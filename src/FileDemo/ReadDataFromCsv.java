package FileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadDataFromCsv {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        String fname = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\cars.csv";
        File f = new File(fname);
        Scanner sc = new Scanner(f);
        //String input = sc.nextLine();
        //System.out.println(input);
        String data = "";
        String lines ="";
        while(sc.hasNextLine())
        {
        data =sc.nextLine();
        lines += data.split(",");
        System.out.println(data);
         }

        // or
     /*   while(sc.hasNextLine())
        {
            data = sc.nextLine();
            System.out.println(Arrays.toString(data.split(",")));

        }*/

    }

}
