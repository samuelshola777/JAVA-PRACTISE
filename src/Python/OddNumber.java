package Python;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number");
        int num = input.nextInt();


if (num % 2 == 0){
    System.out.println("it's an even number");
}else System.out.println("it's not an even number");
    }
}
