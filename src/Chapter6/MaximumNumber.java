package Chapter6;

import java.util.Scanner;

public class MaximumNumber {
       public static void main(String[] args) {

           Scanner input = new Scanner(System.in);

           while (true) {

               System.out.println("please enter your three number");
               double number1 = input.nextDouble();
               System.out.println("please enter your second number");
               double number2 = input.nextDouble();
               System.out.println("please enter your third number");
               double number3 = input.nextDouble();

               double result = Math.max(number1, Math.max(number2, number3));
               System.out.println(result);
               System.out.println("please enter 7 to continue or press 99 to quit");
               int option = input.nextInt();
               if (option == 7) {
                   continue;
               } else if (option == 99) {
                   break;
               }

           }



       }
}
