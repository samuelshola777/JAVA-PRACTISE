package Practice;

import java.security.SecureRandom;

import java.util.Scanner;

public class DieTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MiniDies user1 = new MiniDies();

        MiniDies user2 = new MiniDies();


        System.out.println("please enter your userName1");

        String userName1 = input.nextLine();

        user1.setname(userName1.toUpperCase());

        System.out.println("please enetr your userName2");

        String userName2 = input.nextLine();

        user2.setname(userName2.toUpperCase());

        while (true) {

            System.out.println(userName1 + " please enter your age");

            int age1 = input.nextInt();

            user1.setage(age1);

            if (age1 < 18) {

                System.out.println(userName1 + "  you're too young to place a bet\n" +

                        "please enter a valid age");

                continue;

            } else if (age1 >= 18) {
                break;
            }
        }
        while (true) {

            System.out.println(userName2 + "  please enter your age");

            int age2 = input.nextInt();

            user2.setage(age2);

            if (age2 < 18) {

                System.out.println(userName2 + "  please you're too young to place a bet\n" +

                        "please enter a valid age");
                continue;

            } else {

                break;
            }
        }
        while (true) {

            System.out.println(userName1 + " please deposit some amount\n" +

                    "you can't deposit more 100");

            int balance1 = input.nextInt();

            if (balance1 != 100) {

                System.out.println("please enter a valid amount ");

            } else {

                user1.setbalance(balance1);
                break;
            }
        }
        while (true) {

            System.out.println(userName2 + " please deposit some amount\n" +

                    "you can't deposit more 100");

            int balance2 = input.nextInt();

            if (balance2 != 100) {

                System.out.println("please enter a valid amount ");
            } else {

                user2.setbalance(balance2);

                break;
            }
        }

        System.out.println("user1 \n please confirmm your detail \n" +

                "your user name is " + userName1 + "\n" +

                "you are  " + user1.getAge() + " years old \n" +

                "you deposited  " + user1.getBalance() + "\n" +

                "please press any number to proceed.");

        int repond1 = input.nextInt();


        System.out.println("user2 \nplease confirmm your detail \n" +

                "your user name is " + userName2 + "\n" +

                "you are  " + user2.getAge() + " years old \n" +

                "you deposited  " + user2.getBalance() + "\n" +

                "please press any number to proceed.");

        int repond2 = input.nextInt();

        SecureRandom randomNumber = new SecureRandom();

        System.out.println("          WELCOME TO THE  CRAB GAME");

        while (true) {

            int gee1;
            do {
                System.out.println(userName1 + "  please enter your guess. 1 - 6");
                gee1 = input.nextInt();

                user1.setguess(gee1);
            } while (gee1 > 6 || gee1 < 0);

            System.out.println();
            System.out.println();
            int gee2;

            do {
                System.out.println(userName2 + "  please enter your guess. 1 - 6");
                gee2 = input.nextInt();
                user2.setguess(gee2);
            } while (gee2 > 6 || gee2 < 0);

            int game = 1 + randomNumber.nextInt(6);


            System.out.println(userName1 + " okay your guess number is " + gee1);

            System.out.println();

            System.out.println(userName2 + " okay your guess number is " + gee2);

            System.out.println();
            System.out.println();


            System.out.println("*****the altimate number is: =  " + game);
            System.out.println();
            System.out.println();
            if (game != gee1 && game != gee2) {
                continue;
            }
            if (game == gee1) {
                System.out.println(userName1 + " wow you win the first round");
                user1.setWin(user2.getBalance());

                System.out.println(userName1 + "  your precent balance is: " + user1.getBalance());
                System.out.println(userName2 + " sorry you lose and your current balance is  " + user2.getBalance());

                user2.setLose();


            }
            if (game == gee2) {
                System.out.println(user2.getName() + " wow you win the first round");
                user2.setWin(user1.getBalance());

                System.out.println(userName2 + "  your precent balance is  : " + user2.getBalance());
                System.out.println(userName1 + " sorry you lose and your current balance is  " + user1.getBalance());
                user1.setLose();
                System.out.println(user2.getBalance());

            }


        }
    }


}