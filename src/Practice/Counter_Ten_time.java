package Practice;

import java.util.Scanner;

public class Counter_Ten_time {
    public static void main(String[] args) {

        int scoreCounter = 0;
        int totalScore = 0;
        Scanner input = new Scanner(System.in);
        while (scoreCounter != 10){
            System.out.println("enter a score"+(scoreCounter+1));
            int score = input.nextInt();

            if ( score >= 0 && score <= 100){
                totalScore += score;
                scoreCounter ++;
            }
        }
        System.out.println("total score is"+totalScore);
    }
}
