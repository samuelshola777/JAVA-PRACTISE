package Practice;

import java.util.Scanner;

public class LogicalOprator {
    public static void main(String[] args) {
        //&& = (AND) both condition must be true
        // || = (or) either condition must be true
        // ! = (NOT) reverses boolean value of condition


        int temp = 25;

        if (temp > 30) {
            System.out.println("it is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("it's cold outside");
        }else {
            System.out.println("it's cold out side");
        }


        Scanner Scanner = new Scanner(System.in);
        System.out.println("you are playing a game! press q or press" +
                "Q to quit");
String response = Scanner.nextLine();
//this is a string using the OR logical expression
if (response.equals("q") || response.equals("Q")){
    System.out.println("you quit the game");
}else {
    System.out.println("you are still playing the game 'pew pew'");
}





        }
    }
