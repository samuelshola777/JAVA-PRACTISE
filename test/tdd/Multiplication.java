package tdd;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("enter 1 to perform multiplication");
            int mult = input.nextInt();

            switch (mult) {
                case 1:
                    while (true) {
                        System.out.println("please enter your multiplication 1");
                        int mul1 = input.nextInt();

                        System.out.println("please multiplied by what");
                        int mul2 = input.nextInt();

                        int crack = mul1 * mul2;

                        System.out.println(crack +" to perform another transcation press 2\n press 10 to go back to the " +
                                "main menu");
                        int another = input.nextInt();
                        if (another == 2){
                            continue;
                        } else if (another == 10) {
                            break;
                        }

                    }
            }
        }
    }
}