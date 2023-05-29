package chapter2;

import java.util.Scanner;

public class FiveLargeAndLowInterger {

    public static void minimumNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to minimum finder\n" +
                "please enter 5 number to view the minimum of the five number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

       int minimum = num1;

        if (num2 < minimum){
            minimum = num2;
        }
        if (num3 < minimum){
            minimum = num3;
        }if (num4 < minimum){
            minimum = num4;
        }if (num5 < minimum){
            minimum = num5;
        }
        System.out.println("your minimum number is  :"+ minimum);
    }





    public static void maximumNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 5 number to view the maximum of the five number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

      int  maximum = num1;

      if (num2 > maximum){
          maximum = num2;
      }
      if (num3 > maximum){
          maximum = num3;
      }if (num4 > maximum){
          maximum = num4;
      }if (num5 > maximum){
          maximum = num5;
      }
        System.out.println("your maximum number is  :"+ maximum);
    }

    public static void main(String[] args) {
       minimumNumber();
       maximumNumber();
    }
}
