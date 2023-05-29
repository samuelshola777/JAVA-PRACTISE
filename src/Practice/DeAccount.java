package Practice;

import java.util.Scanner;

public class DeAccount {

    public static  void displayAccount1(){
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        int balance = 0 ;
        String name = "";
        int setWidrawal = 0;

        System.out.println("hi\n good day and welcome to account 1\n" +
                "press any number to create an account with account 1");
        int start = input.nextInt();
while (true){
        System.out.println("press 1 to enter an account name : \n" +
                "press 2 to make some deposit : \n" +
                "press 3 to make some withdrawal : \n" +
                "press 4 to view Account 1 details");
        int responce = input.nextInt();

        switch (responce) {

            case 1:
                System.out.println("please  enter an account name: ");
                name = string.nextLine();
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

            case 2:
                System.out.println("please make  some deposit : ");
                balance = input.nextInt();
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

            case 3:
                System.out.println("please enter amount to withdraw : ");
                double withdral = input.nextDouble();

                 balance = (int) (balance - withdral);

                System.out.println(withdral + "#  was successfully withdraw from your account :  \n");
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

            case 4:
                System.out.println("your account name is  " + name + "\n" +
                        "and your current balance is " + balance+"#\n");
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

        }

        }

    }
public static  void displayAccount2(){
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        int balance = 0 ;
        String name = "";
        int setWidrawal = 0;

        System.out.println("hi\n good day and welcome to account 2\n" +
                "press any number to create an account with account 2");
        int start = input.nextInt();
while (true){
        System.out.println("press 1 to enter an account name : \n" +
                "press 2 to make some deposit : \n" +
                "press 3 to make some withdrawal : \n" +
                "press 4 to view Account 1 details");
        int responce = input.nextInt();

        switch (responce) {

            case 1:
                System.out.println("please  enter an account name: ");
                name = string.nextLine();
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

            case 2:
                System.out.println("please make  some deposit : ");
                balance = input.nextInt();
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

            case 3:
                System.out.println("please enter amount to withdraw : ");
                double withdral = input.nextDouble();
               while (true) {
                   if (withdral > balance) {
                                         }
                   else {
                       break;
                   }
               }
                 withdral =  balance - withdral;

                System.out.println(withdral + "#  was successfully withdraw from your account :  \n");
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

            case 4:
                System.out.println("your account name is  " + name + "\n" +
                        "and your current balance is " + balance+"#\n");
                System.out.println("<<--------------------------->>\n" +
                        "please enter 700 to go back to the main menu");
                responce = input.nextInt();
                if (responce == 700){
                    continue;
                }
                break;

        }

        }

    }

}
