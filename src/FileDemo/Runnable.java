package FileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Runnable {
    public static void main(String[] args) throws MyFileException, FileNotFoundException, IOException {
        String path = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder";
        File dir = new File(path);
        System.out.println(dir.isDirectory());
        String[]  accessFileName =   dir.list(); // return an Array of String
       // System.out.println( Arrays.toString(accessFileName));

        File[] FilewithPath =  dir.listFiles(); // return an  Array of FIles
       // System.out.println(Arrays.toString(FilewithPath));

        String path2 = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\DataDemo.txt";
        File f = new File(path2);
        System.out.println("The path is abolute path: " + f.isAbsolute());
        System.out.println("Return Absolute path of the File " + f.getAbsolutePath());
        System.out.println("Return Parent folder of the given File " + f.getParent());
        System.out.println("File is Exist " + f.exists());
        if(f.exists())  // true or False
        {
            System.out.println("File is Found");
            System.out.println("IS file Readable " +  f.canRead());
            System.out.println("IS file Writeable " +  f.canWrite());
            System.out.println("File size in a bytes " + f.length()); // file size in byte
            // 775 , 777 , 757 permission
            Scanner sc = new Scanner(f);
            while(sc.hasNext())   // return true till last character
            {
                String ReadLinebyLine =  sc.nextLine();
                System.out.println(ReadLinebyLine);
            }
        }
        else
        {
            System.out.println("File is not FOUND");
            if(f.createNewFile())
            {
                System.out.println( "File name is : " +  f.getName());
            }
        }




// Create Three Files(txt) along with some Data and

         //  Read all files with Data/content together


        // mkdir
      /* String folderPath =  "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\NewFolderCreatedBYJava\\ABC";
       File fcreatefolder = new File(folderPath);
       if(fcreatefolder.isDirectory())  // true or false
       {
           System.out.println("Directory / Folder can not be created");
       }
       else {
               if(fcreatefolder.mkdir()) // true or false
               {
                   System.out.println("Directory / Folder is created");
               }
               else {
                   System.out.println("Directory / Folder can not be created");
               }

       }*/







        /*if(dir.isDirectory())
        {
            System.out.println("This path is pointing to Directory");
        }
        else
        {
            throw new MyFileException("This path is not pointing to Directory");
        }*/

    }
}
