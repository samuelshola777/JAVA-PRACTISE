package chapter2;

import java.util.Scanner;

public class TheIfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("enter second integer: ");
        int number2 = input.nextInt();

    if ( number1 == number2){
        System.out.printf("%d == %d%n", number1, number2);
    }
    if(number1 != number2){
        System.out.printf("%d != %d%n", number1 ,number2);

    }
if (number1 > number2){
    System.out.printf("%d > %d%n", number1 ,number2);
}
if (number1 < number2){
    System.out.printf( "%d< %d%n", number1, number2  );
}
if (number1 <= number2){
    System.out.printf("%d<=%d%n", number1 , number2);
}
if (number1 >= number2){
    System.out.printf("%d>=%d%n", number1 , number2);
}


    }
}
