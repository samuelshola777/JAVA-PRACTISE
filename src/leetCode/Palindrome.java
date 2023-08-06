package leetCode;

public class Palindrome {



    public static String reverseString(int wordz){
        String word = Integer.toString(wordz);
        String receiver =  " ";
        for (int i = word.length()-1; i >= 0 ;i--) {
        receiver += word.charAt(i);
        }
        System.out.println(receiver);
        return receiver;
    }



    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; // Negative numbers are not palindromes
        }
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(111111111));
    }

}
