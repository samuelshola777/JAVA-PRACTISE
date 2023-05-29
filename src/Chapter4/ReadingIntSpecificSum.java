package Chapter4;

import java.util.Scanner;

public class ReadingIntSpecificSum {
    public static void main(String[] args) {
        int num = 0;
        int num2 = 0;
        int sum = 0;
        while (true) {
            System.out.println("enter value greater than 500 ");
            num = MilePerGarlon2.tryAndCatch();
            if (num < 500) {
                continue;
            } else {
                break;
            }
        }

        while (true){
            System.out.println("please enter number less 250");
            num2 = MilePerGarlon2.tryAndCatch();
            if (num2 < num/2) {
                sum += num2;
                if (sum >= num) {
                    System.out.println("*** your total input is **** " + sum);
                    break;
                }
                System.out.println("your number has been saved \n" +
                        "total number saved is  **********  " + sum);
                continue;
            }
            else if (num2 > num / 2){
                System.out.println("***** you have entered a wrong input ");
                continue;
}
        }
    }
}






