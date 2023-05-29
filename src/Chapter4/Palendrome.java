package Chapter4;

import java.util.Scanner;

public class Palendrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter five digit number ");
        String number = scanner.nextLine();

        String newString = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            newString += number.charAt(i);
        }

        if (newString.equals(number)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }




    }
}
