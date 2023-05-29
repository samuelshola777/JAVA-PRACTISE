package chapter2;

import java.util.Scanner;

public class Divisible_by_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a value to check if divisible by 3");
        int num = input.nextInt();

        if (num % 3 == 0){
            System.out.println("it's is divisible by 3");
        }else {
            System.out.println("it is not divisible by 3");
        }


    }
}
