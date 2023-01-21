package chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class FlightSitAssignment {

   public static void economySit() {
       boolean[] economyBookin = new boolean[5];

       Scanner input = new Scanner(System.in);

       Scanner goat = new Scanner(System.in);
       SecureRandom random = new SecureRandom();

do {
    int sitNumber = 100+ random.nextInt(200);
       System.out.println("hello \n" +
               "Welcome to Economy sit booking\n" +
               "please enter any number to book a sit");
       int welcome = input.nextInt();
       System.out.println("");
       System.out.println("<------------------------------------------>");
       System.out.println("please enter your name ");
       String name = goat.nextLine();

       for (int boneshaker = 0 ; boneshaker < 5; boneshaker++){
           System.out.println("<------------------------------------------>");
           if (economyBookin[boneshaker] == false){
               economyBookin[boneshaker] = true;
               System.out.println("<------------------------------------------>");

               System.out.printf("%s%s%s%s%d%s%d%n", "HELLO ", name, ", A convenient sit has been assigned to you",
                       " at  sit ", boneshaker+1," and your sit number is ", sitNumber );

               System.out.println(economyBookin[0]);
               System.out.println(economyBookin[1]);
               System.out.println(economyBookin[2]);
               System.out.println(economyBookin[3]);
               System.out.println(economyBookin[4]);
               System.out.println("<------------------------------------------>");
               System.out.println();

if (economyBookin[boneshaker] == true){

    break;
}
           }

       }

   }while (true);

   }
    public static void firstClassSit() {
        SecureRandom random = new SecureRandom();

        int sitNumber = 100 + random.nextInt(200);

        Scanner secondScanner = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        boolean[] firstClassSeat = new boolean[5];
        do {


            System.out.println("hi\n Welcome to first class sit booking\n" +
                    "to book a sit at the first class please input your details\n" +
                    "PRESS ANY NUMBER TO BEGIN REGISTRATION");
            int welcome = input.nextInt();
            System.out.println();
            System.out.println();
            System.out.println("<----------------------------------------------->");

            System.out.println("please input your name ");
            String userName = secondScanner.nextLine();
            System.out.println();
            System.out.println("<----------------------------------------------->");

            for (int i = 0; i < 5; i++) {
                if (firstClassSeat[i] == false) {
                    firstClassSeat[i] = true;
                    System.out.printf("hi  \n\n".toUpperCase() + userName + "  a very sweet sit has been assigned\n" +
                            "to you at sit %d  and your sit number is  %d  \n:", i + 1, sitNumber);
                    System.out.println("<----------------------------------------------->");
                    System.out.println(firstClassSeat[0]);
                    System.out.println(firstClassSeat[1]);
                    System.out.println(firstClassSeat[2]);
                    System.out.println(firstClassSeat[3]);
                    System.out.println(firstClassSeat[4]);
                    System.out.println("<----------------------------------------------->");
                    System.out.println();
                    System.out.println();

                    break;

                    }
                }
                    if (firstClassSeat[4] == true) {
                        System.out.println("!!! we'er so sorry all the sit at first class has been occupied\n" +
                                "please book an economy sit");

                        System.out.println("<----------------------------------------------->");
                        System.out.println();
break;
            }

        }while (true);
    }
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int option;

        System.out.println("hi\n" +
                "welcome to flight sit booking\n" +
                "for first class enter 1\n".toUpperCase() +
                "for economy enter 2".toUpperCase());
        option = input.nextInt();

        switch (option){

            case 1 -> firstClassSit();
            case 2 -> economySit();
        }

    }
}
