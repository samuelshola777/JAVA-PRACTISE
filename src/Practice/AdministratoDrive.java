package Practice;

import java.util.Objects;
import java.util.Scanner;

public class AdministratoDrive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // Scanner input2 = new Scanner(System.in);

AdministraitorApp user1 = new AdministraitorApp();



        System.out.println("hi \n good day, well come to the administrator plateform.\n" +
                "to gain access to our services you'll have to create an account with us\n\n" +
                "ENTER  ANY NUMBER TO CREATE AN ACCOUNT");
                int response = input.nextInt();
              input.nextLine();

        System.out.println();
        System.out.println();

        System.out.print("TO CREATE AN ACCOUNT, ENTER A USER NAME:  ");
        String accountName = input.nextLine();

        user1.setuserName(accountName);

        System.out.println("your account name is "+accountName);



        System.out.println();

        System.out.println("Enter a four digit number password");
       user1.setPassword(input.nextInt());



        System.out.println("         ********  WELCOME TO THE ADMINISTRATRY PLATE FORM\n\n\n" +
                "input your login detail to access the ADMINISTRATOR plate  ");

    while (true) {
        System.out.println("please enter your account name to login");
        String name = input.nextLine();
        if (!Objects.equals(name, accountName)) {
            System.out.println("your entered an invalid account name");
            continue;
        } else {
            System.out.println("user name confirmed");
        }
        break;

    }

        while (true){
            System.out.println("please enter password");
            int password = input.nextInt();
            if (password != user1.getPassword()){
                System.out.println("invalid password");
                continue;
            } else if ( (password == user1.getPassword())) {

                    System.out.println("logining successfull");
                }break;
            }



    }
    }

