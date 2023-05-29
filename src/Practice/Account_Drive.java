package Practice;

import Python.Account_class;

import java.util.Scanner;

public class Account_Drive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account_class user1 = new Account_class("", 0.0, 0.0, 0.0);
        Account_class user2 = new Account_class("", 0.0, 0.0, 0.0);
        System.out.println("<________________________________________________________>");

        System.out.println("HI \n WELCOME TO SAMUEL SHOLA ELE MI LO MA LAST MINI BANK\n\n" +
                "HERE ARE OUR SERVICES\n" +
                "these room for 2 users \n\n" +
                "for user1 press 80\n\n" +
                "for user2  pree 100\n\n");
        int result = input.nextInt();

        switch (result){
            case 100:
                System.out.println("hi\nplease creat an account by entering your account details");
                System.out.println("");
                System.out.println("enter accout name");
                String name = input.nextLine();
                user1.setName(name);
                
        }

        System.out.println("to view default account name press 1 bt you'll have to save an account name immidately....\n" +
                "to view default account balance press 2 bt you'll have to make deposit immidately........\n" +
                "to make withdrawal you most have made some deposi else you won't be able to make withdrawal");

        int action = input.nextInt();

        System.out.println("<________________________________________________________>");

        switch (action) {

            case 1:


        }


        System.out.printf("your name is Empty\n please enter a user name" +
                "  ");
        String name1 = input.nextLine();
        user1.setName(name1);


        System.out.printf("your name is Empty\n please enter a user name" +
                "  ");
        String name2 = input.nextLine();
        user2.setName(name2);

        System.out.println("your New user name is %s " + user1.getName());

        System.out.println("your New user name is  " + user2.getName());

    }
}