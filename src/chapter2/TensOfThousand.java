package chapter2;

import java.util.Scanner;

public class TensOfThousand {
    public static void main(String[] args) {


        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter number");
        int number = input.nextInt();

       num1 = number / 10_000;
       num2 = number % 10_000/1000;
       num3 = number %10_000%1000/100;
       num4 = number % 10_000 % 1000 % 100 / 10;
       num5 = number % 10_000 % 1000 % 100 % 10;
        System.out.printf("%d  %d  %d   %d  %d",num1,num2,num3,num4,num5);





    }



}
