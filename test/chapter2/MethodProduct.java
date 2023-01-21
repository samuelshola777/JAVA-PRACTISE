package chapter2;

import java.util.Scanner;

public class MethodProduct {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        int product = num1 * num2 * num3;

        System.out.println("product simply means multiplication  "+ product);
        System.out.printf("product simple means multiplication  %d", product);


    }

}
