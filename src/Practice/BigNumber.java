package Practice;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("please input your big number");
            double number1 = input.nextDouble();

            System.out.println("please input your big number ");
            double number2 = input.nextDouble();

            double total = 0;

            if (number1 > number2) {
                number1 = total;
            } else if (number2 > number1) {
                number2 = total;
            }

            System.out.println("please entre your big number");
            double number3 = input.nextDouble();

            System.out.println(" please enter your big number");
            double number4 = input.nextDouble();

            int big = 0;
            if (number3 > number4) {
                number3 = big;
            } else if (number4 > number3) {
                number4 = big;

            }
            int sum =  0;
            if (big > total) {
                big = sum;
            } else if (total > big) {
                total = sum;

            }
            System.out.println("khyclouf;iiudciyhxikyhiydxdkihydcikhyiydcikhyikdciyhcyciyhc"+"   "+big+"   "+sum);

        }
    }
}
