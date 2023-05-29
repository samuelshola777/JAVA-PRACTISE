package Practice;

import java.util.Scanner;

public class S_Time_Calculator {
    public static void main(String[] args) {
        Time_calculator time1 = new Time_calculator();

        Scanner input = new Scanner(System.in);


        System.out.println("enter number of seconds you want to convert to minute");
        int result = input.nextInt();

       int minute  = result / 60 ;

        System.out.println( "you can only get "+minute+" from "+ result +" seconds value that you inputed");

    }

}
