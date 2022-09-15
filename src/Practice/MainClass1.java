package Practice;

import java.util.Scanner;

public class MainClass1 {

    public static void main(String[] args) {

        Scanner boneshaker = new Scanner(System.in);

        int sambone = 34;


        System.out.println("guess what number i have with me");
        int guess = boneshaker.nextInt();

        if (sambone <= guess) {
            System.out.println("oops your guess is higher");
        } else if (guess >= sambone) {
            System.out.println("oh you're actually lowwer than");
        } else if ( guess == sambone){
            System.out.println("you're rigth");
        }




        System.out.println("guess what number i have with me");
        int gues = boneshaker.nextInt();

        if (sambone <= gues) {
            System.out.println("oops your guess is higher");
        } else if (gues >= sambone) {
            System.out.println("oh you're actually lowwer than");
        } else if ( gues == sambone){
            System.out.println("you're rigth");
        }
    }
}