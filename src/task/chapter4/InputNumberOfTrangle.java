package task.chapter4;

import java.util.Scanner;

public class InputNumberOfTrangle {

    public static void printStar(int numberOfSar) {
        for (int i = 0; i < numberOfSar; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
            System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
while (true) {


    System.out.println("please enter number of trangle ");
    int numberOfSar = scanner.nextInt();

    printStar(numberOfSar);
    System.out.println("""
            to continue press yes or press no to Exit
            """);
    String control = scanner1.nextLine();
    if (control.equals("yes"))continue;
    break;
}

    }
}
