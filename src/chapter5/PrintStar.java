package chapter5;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int number = 0 ;
int later = 0;
int time = 0;

    while (time < 5){
System.out.println("please enter number that is less than 30");
     number = input.nextInt();

     if (number <= 30){
            time++;
         later += number;
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
    }

for (int i = 0; i < later; i++) {
    for (int j = 0; j < i; j++) {
        System.out.print("*");
}
    System.out.println();
}
        System.out.println("this is the total number of input  "+ later);

    }
}
