package Practice;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


            System.out.println("please input your big number");
            double number1 = input.nextDouble();

            System.out.println("please input your big number ");
            double number2 = input.nextDouble();



            if (number1 > number2) {
                number1 = number2;
            } else if (number2 > number1) {
                number2 = number2;
            }

            System.out.println("please entre your big number");
            double number3 = input.nextDouble();

            System.out.println(" please enter your big number");
            double number4 = input.nextDouble();

      if (number3 > number4){
          number4 = number3;
      } else if (number4 > number3) {
          number4 = number3;
      }

            System.out.println( number2 + number3 );

        }
    }

