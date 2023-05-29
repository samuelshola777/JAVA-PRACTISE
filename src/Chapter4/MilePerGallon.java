package Chapter4;

import java.awt.*;
import java.util.Scanner;

public class MilePerGallon {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

MilePerGarlon2 mileC = new MilePerGarlon2();



        System.out.println("welcome to automobile calculator \n" +
                "we've got empty tank  if your wanna fill up the tank for the next trip enter 1 \n" +
                "if you wanna move with some gallon enter 2 ");
        int responce = MilePerGarlon2.tryAndCatch();


       int fullTank = mileC.fullTank(responce );

        System.out.println("enter number of mile,\n" +
                " please remeber 5 is the highest mile");
        int mile = MilePerGarlon2.tryAndCatch();

        System.out.println( mileC.mileCalculator(mile, fullTank));

    }


}
