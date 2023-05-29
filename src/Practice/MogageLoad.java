package Practice;

import java.util.Scanner;

public class MogageLoad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
final int YEARS = 12;

double percent = 0.05;

        System.out.println("please state the amount you want to loan");
        int loan = input.nextInt();

        System.out.println("please enter how many years it will take");
         int years =  input.nextInt();
     int months = years * YEARS;

        int amount = loan;
        for (int i = 1; i <= months; i++) {
            amount = (int) (amount * percent) + amount;
        }

        System.out.println(amount);


    }


    public static void fivePercentIncreament(int z){

        final int PERCENTAGE = 100;



        System.out.println(100* 0.05 + z);

    }

}
