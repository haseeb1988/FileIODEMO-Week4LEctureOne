package FileDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Deletme {

    public static void main(String[] args)
    {
        String fname = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\cars.csv";
        Scanner sc = new Scanner(fname);
        sc.useDelimiter(",");
        String Car,MPG,Cylinders,Displacement,Horsepower,Weight,Acceleration,Model,Origin;
        while(sc.hasNext())

        {
            Car = sc.next();
            MPG = sc.next();
            Cylinders = sc.next();
            Displacement = sc.next();
            Horsepower = sc.next();
            Weight = sc.next();
            Acceleration = sc.next();
            Model = sc.next();
            Origin = sc.nextLine();
            String currentItem = Car + "," + MPG + "," + Cylinders + "," + Displacement + "," + Horsepower + "," + Weight + "," + Acceleration + "," + Model + "," + Origin;

            String[] itemlist = currentItem.split(",");
            List<String> regexlist = Arrays.asList(itemlist);
            ArrayList<String> arrayList = new ArrayList<String>(regexlist);
            System.out.println("Item: " + arrayList);
        }
        sc.close();
    }



}
