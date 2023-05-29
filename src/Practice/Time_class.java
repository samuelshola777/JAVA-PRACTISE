package Practice;

import java.util.Scanner;

public class Time_class {
    public static void main(String[] args) {

        Modulous_Class time = new Modulous_Class(0, 0, 0);

        Scanner input = new Scanner(System.in);
        System.out.println("please input  a value to be formated");
        int tym = input.nextInt();

       int day =  tym / 24;
       int min = tym % 24;

        System.out.println("my name is samuel shola");

        System.out.println("you can get "+day+" 'hours' "+ min +" minute from "+ tym );
        System.out.println("<---------------------------------------->");

        int minute = tym / 60;
        int sec = tym % 60;
        System.out.println("you can get "+minute+" 'minutes' "+ sec+"  seconds from "+ tym);

        System.out.println("<---------------------------------------->");
        int second = tym / 60;
        System.out.println("you can get "+second+" 'seconds' from "+tym);

    }
}
