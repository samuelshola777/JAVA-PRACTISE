package PracticeMart;

import java.util.Scanner;

public class PrintStarWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int number = input.nextInt();

        printStar(number);
        PrintStarWithMethod psm = new PrintStarWithMethod(14,6,1996);

        System.out.println(psm);



    }
    private int date;
    private int month;
    private int year;
    public static void printStar(int number){

        for (int i = 1; i <= number; i++) {
            System.out.printf("%2s", "*");

            if (i % 5==0 ) {
                System.out.println();
            }

       }


    }
    public String toString(){
        return String.format("%02d : %02d : %02d", date, month, year);

    }

    public  PrintStarWithMethod(int date , int month, int year){

        this.date = date;
        this.month = month;
        this.year = year;


    }


}
