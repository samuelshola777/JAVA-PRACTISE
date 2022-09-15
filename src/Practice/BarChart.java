package Practice;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of stars you want: ");

        int number = input.nextInt();

        for (int star = 0; star < number; star++){
            System.out.println("$%* ");
        }
    }
}
