package task;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessCorrectly {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

    int birthDate = 0;
    int guessDate = 0;



 while (true){

      birthDate = random.nextInt(1, 6);
     System.out.println("guess my birth date ");
      guessDate =scan.nextInt();

            if (guessDate == birthDate) {
                System.out.println("you guessed my birth date correctly");
                break;
            }
            System.out.println("wrong birth date, try again later ");


        }

    }
}
