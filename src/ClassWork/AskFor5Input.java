package ClassWork;

import java.util.Scanner;

public class AskFor5Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Samuel Shola");
//
        int []  arrayNumber = new int[5];



        int max = arrayNumber[0];


        for (int counter = 0; counter < arrayNumber.length; counter++){

            System.out.println("please enter 5 valid number less than 100 ");
            int reply = input.nextInt();

            if (reply > 100) {
               continue;
            }
            else if (reply < 100) {

                arrayNumber[counter] = reply;
            }



            if (arrayNumber[counter] > max){
                max =  arrayNumber[counter];
            }



        }

        int mini = arrayNumber[0];
        for (int counter = 0 ; counter < arrayNumber.length; counter++){
            if (arrayNumber[counter] < mini){
                mini = arrayNumber[counter];
            }

        }
        System.out.println("the maximum value is "+max);

        System.out.println("the minimum value is "+mini);
    }

}
