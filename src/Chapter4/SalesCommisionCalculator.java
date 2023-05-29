package Chapter4;

import java.util.Scanner;

public class SalesCommisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saleR = 0.0;
        double sTotal = 0;



        System.out.println("enter number of days of the week ");
        int numOfWeek = scanner.nextInt();

        for(int i = 1 ;i < numOfWeek ; i++ ) {

    System.out.println("please enter sales for day " +i);
  saleR  = scanner.nextDouble();
 sTotal += saleR;
}
        double sam = (9 * saleR / 100);

        double totalPay = sam + 200;


        System.out.println(" total sale of the week is  "+ sTotal +"\n" +
                "the percentage is "+ sam+ "\n" +
                " and the total pay is "+totalPay);

    }



}
