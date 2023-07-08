package chapter2;

import java.util.Scanner;

public class ThreeMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your number");
        int x = input.nextInt();

        System.out.println("please enter your next number");
        int y = input.nextInt();

        System.out.println("please enter your third number ");
        int z = input.nextInt();

        int result = x * y * z;

        System.out.printf("product is %d%n", result);





    }
}
