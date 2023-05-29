package Python;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input a number from one to ten");
      int number = input.nextInt();

    String goat = oneToTen(number);

        System.out.println(goat);


    }
    public static String oneToTen(int number){

        return switch (number){
            case 1 -> "one";
            case 2 -> "two";
            default -> "";
        };

    }
}
