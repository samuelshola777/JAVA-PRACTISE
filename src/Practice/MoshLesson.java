package Practice;
import java.text.NumberFormat;
import java.util.Scanner;

public class MoshLesson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    final int  MONTHS_IN_YEARS = 12;
    final int PERCENT = 100;

        System.out.println("please enter amount to loan: ");
        int loan = input.nextInt();

        System.out.println("please enter rate: ");
        double interest = input.nextDouble();
  double monthlyInterest = interest / PERCENT/ MONTHS_IN_YEARS;

        System.out.println("how long will it take you to refund");
        int years = input.nextInt();

        int numberOfPayments = years * MONTHS_IN_YEARS;

            double mortgage = loan * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                    (Math.pow(1+ monthlyInterest, numberOfPayments)-1);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage : "+ mortgageFormatted);
    }
}
