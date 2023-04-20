package task.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
static   SecureRandom secureRandom = new SecureRandom();
static Scanner scanner = new Scanner(System.in);
    public static int answerProvider(int number1, int number2){
        return number1 * number2;
    }
    public static int number1Generator(){
        int number1 = secureRandom.nextInt(1, 10);
        return number1;
    }
    public static int number2Generator(){
        int number2 = secureRandom.nextInt(1, 10);
        return number2;
    }

    public static boolean questionAsker(){
        int number1 = number1Generator();
        int number2 = number2Generator();
     while (true) {
         System.out.println("please answer the question below  " +
                 "\n" + "()->   " + number1 + " * " + number2);
         int StudentAnswer = scanner.nextInt();
         int answer2 = answerProvider(number1, number2);
         if (StudentAnswer == answer2) {
             break;
         }
         System.out.println("no , please try again");
     }
   return true;
    }

    public static void main(String[] args) {



    }


}
