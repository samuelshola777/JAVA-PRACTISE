package task.chapter4;

import java.util.Scanner;

public class Palindromes {

    public static boolean ifContainAlphabetic(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static String palindromes(){
        Scanner input = new Scanner(System.in);
        String words;
        while (true) {
            System.out.println("please enter 5 numbers ");
              words = input.nextLine();
            if (words.length() != 5 ||!ifContainAlphabetic(words) ) {
                System.out.println("you are to enter number and not more than five \n " +
                        "\n you're not to enter alphabet ");
                continue;
            }
            break;
        }
        char [] alphabes = new char[words.length()];
        StringBuilder result = new StringBuilder("  ");
        for (int i =  words.length() -1; i >= 0 ; i--) {
          alphabes[i] = words.charAt(i);
          result.append(alphabes[i]);
//          words += words.charAt(i);
        }
        for (int i = 0; i < result.length(); i++) {
            if ( result.equals(words)) {
                return "it's a palindrome ()->  "+ result +"  word "+words;
            }
        }return "it's not a palindrome  ()->  "+ result;

    }


    public static boolean isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        System.out.println("enter number of words");
        String words = scanner.nextLine();

        for (int i = words.length() -1; i >= 0; i--) {
            builder.append(words.charAt(i));
        }
        String newWord = builder.toString();
        if (newWord.equals(words)) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
//        Scanner input1 = new Scanner(System.in);
//        while (true){
//        System.out.println(palindromes());
//
//
//        System.out.println("""
//            to continue press yes or press no to Exit
//            """);
//        String control = input1.nextLine();
//        if (control.equals("yes"))continue;
//        break;


        System.out.println(isPalindrome());
    }

}
