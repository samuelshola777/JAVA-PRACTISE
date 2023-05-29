package Arrays;

import java.util.Scanner;

public class Palindronm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a string \r");
        String word = input.nextLine();

        String palindrome = "";

        for (int i = word.length() - 1; i >= 0; i--) {
                palindrome += word.charAt(i);
        }
        if (palindrome.equalsIgnoreCase(word)) {
            System.out.println("The word is a palindrome");
        }
        else System.out.println("It is not a palindrome");

    }
}
