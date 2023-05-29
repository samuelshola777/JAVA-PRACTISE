package chapter2;

import java.util.Scanner;

public class Average_Large_Low {
    public static void doingItAll(){
        Scanner input = new Scanner(System.in);

        System.out.println("please input three values");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        int add = num1 + num2 + num3;

        System.out.println("the total addition of the three value is "+add);

        int maximum = num1;

        int minimum = num1;

        if (num2 > maximum){
            maximum = num2;
        }
        if (num2 < minimum){
            minimum = num2;
        }
        if (num3 > maximum){
            maximum = num3;
        }
        if (num3 < minimum){
            minimum = num3;
        }
        System.out.println("the maximum of your three input is "+maximum);
        System.out.println();
        System.out.println("the minimum of your three inputs is "+minimum);

        int average = num1 + num2 + num3 / 3;

        System.out.println("the average of the three input "+ average);

        int product = num1 * num2 * num3;

        System.out.println("and the product of the three input is "+product);

    }

    public static void main(String[] args) {
        doingItAll();
    }


}
