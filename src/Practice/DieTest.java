package Practice;

import java.util.Scanner;

public class DieTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MiniDies User1 = new MiniDies();
        MiniDies User2 = new MiniDies();

        while (true) {
            System.out.println("please enter  userName1");
            String userName1 = input.nextLine();
            User1.setname(userName1);


            System.out.println("please enter userName2");
            String userName2 = input.nextLine();
            User2.setname(userName2);

            while (true) {
                System.out.println("please enter your age for user1");
                int user1age = input.nextInt();
                User1.setage(user1age);
                if (user1age < 18) {
                    System.out.println("you are too young to place a bet, \n please enter a valid,");

                    continue;
                }

                while (true) {
                    System.out.println("please enter age for user2");
                    int user2age = input.nextInt();
                    User2.setage(user2age);
                    if (user2age < 18) {
                        System.out.println("please you're too young to place a bet, \nplease enter a valid age");
                        continue;
                    }
                }
            }


                }
            }
        }





