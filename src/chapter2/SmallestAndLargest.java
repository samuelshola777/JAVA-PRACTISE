package chapter2;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your number");
        int num1 = input.nextInt();

        System.out.println("please enter your second number");
        int num2 = input.nextInt();

        System.out.println("please enter your third nmuber");
        int num3 = input.nextInt();

        int adding = num1 + num2 + num3;

        int average = adding / 3;

        int product = num1 * num2 * num3;

        int large = Math.max(num1,Math.max(num2,num3));

        int low = Math.min(num1,Math.min(num2,num3));

        System.out.println("addition of the three number:  "+adding+"\n\n" +
                "the avrage of the three number: "+ average+"\n\n" +
                "the product of the three number: "+ product+"\n\n" +
                "the lowest of the three number:  "+ low+"\n\n" +
                "the largest of the three number:  "+ large );





    }



}
