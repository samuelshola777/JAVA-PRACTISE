package chapter2;

import java.util.Scanner;

public class SquareAndDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1= input.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = input.nextInt();


        int sum1 = num1 * num1;


        int sum2 = num2 * num2;

        System.out.println("first sum "+sum1);

        System.out.println();

        System.out.println("second "+sum2);
        System.out.println();
        int sumSquare = sum1 + sum2;

        System.out.println( "addition of the two sum "+sumSquare);

        int superSum = sum1 - sum2;
        System.out.println();

        System.out.println("diffrence "+sumSquare);


    }

}
