package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatchMethod {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("please what's your number \n");

        int number = tryCatchException();



        System.out.println("now i know your number. your number is  "+number);



    }


    public static int tryCatchException(){
        Scanner input = new Scanner(System.in);
        int    justNumber = 0;

        while (true) {
            try {
                justNumber = Integer.parseInt(input.next());
                break;
            } catch (NumberFormatException smile) {
                System.out.println("you have entered a wrong input type. \n please input again ");
            }
        }

        return justNumber;
    }


}
