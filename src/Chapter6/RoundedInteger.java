package Chapter6;

import java.util.Scanner;

public class RoundedInteger {
   static Scanner  take = new Scanner(System.in);
    public static String roundUpInteger(double number) {
       double round = Math.floor(number);
    return String.format("""
            the real number  = %f \n
            the rounded value = %f 
            """,number, round);
    }
    public static void main(String[] args) {


        System.out.println("please enter the number you wan to fomart");
        double numnumber = take.nextDouble();
        System.out.println(roundUpInteger(numnumber));

    }
}
