package Practice;

import java.util.Scanner;

public class FeetAndMeter {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
      double minute = 60;
        System.out.println("enter number of feets ");
        int seconds = scanner.nextInt();

    double total =   seconds / minute ;
        System.out.println("numer of minute "+ total);
    }

}
