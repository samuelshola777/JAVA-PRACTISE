package task.chapter4;

import java.util.Scanner;

public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int [] userInput = new int[10];
        while (count < userInput.length){
            System.out.println("please enter number 1 or 2");
            int num = scanner.nextInt();
            if (num != 1 && num != 2){
                continue;
            }
            userInput[count] = num;
            count++;
        }
    }
}
