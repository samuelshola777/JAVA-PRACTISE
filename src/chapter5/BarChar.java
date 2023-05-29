package chapter5;

import java.util.Scanner;

public class BarChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int later = 0;

int time = 0;
while (time < 5){

System.out.println("please enter number");
number   = scanner.nextInt();

            if (number < 30) {
                time++;

            }
     else {
         continue;
     }

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();


        }
        later += number;
        for (int i = 0; i < later; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nthis is the number of stars i'm expecting later  "+later);



    }
}
