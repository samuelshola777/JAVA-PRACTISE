package chapter5;

import java.util.Scanner;

public class UserInputMaxAndMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter how many number you wanna calculate");
        int times = scanner.nextInt();

        int max = 0;
        int min = 0;
        int first = 0;
        for (int i = 0; i < times; i++) {

            System.out.println("please enter your next number");
            first = scanner.nextInt();
            if (first > max)
            max = first;

            if (first < max) {
                min = first;
            }
        }
        System.out.println("this is the max  "+max);
        System.out.println("this is the min  "+min);
    }
}
