package Chapter4;

import java.util.Scanner;

public class CredictLimit {
    public static void main(String[] args) {

       String accNum = " ";


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter account number");
      accNum  = scanner.nextLine();

        System.out.println("please enter balance at the begining of the month ");
        int oldBalance = MilePerGarlon2.tryAndCatch();

        System.out.println("enter number of item charged for  ");
        int item = MilePerGarlon2.tryAndCatch();

        System.out.println("enter charged amount for each item  ");
        int cAmount = MilePerGarlon2.tryAndCatch();

        System.out.println("enter total credit applied ");
        int cApplied = MilePerGarlon2.tryAndCatch();

//        int totalCharge = oldBalance + cApplied - cAmount;

        int totalCharge = (cAmount * item) - cApplied ;

        System.out.println(totalCharge);
        int newB = oldBalance - totalCharge;
        System.out.println("for the customer with account number \n" +
                ""+accNum+" the new balance is   "+newB);
        System.out.println();
        if (totalCharge < oldBalance/2){
            System.out.println("limit not exceeded ");
        }else {
            System.out.println("credit limit exceeded   ");
        }

    }
}
