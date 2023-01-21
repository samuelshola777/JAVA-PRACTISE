package PracticeMart;

import java.time.LocalDate;
import java.util.Scanner;

public class UseUserDetails {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        UserInformtionStatic userDetails = new UserInformtionStatic("samuel",
                "shola",78,14,
                     06,1996,27,
                        10,2022,"ilaje road",
                            103,"lagos state");

        System.out.println("please enter first name \n");
            String fistName = string.nextLine();
                System.out.println("please enter last name \n");
                    String lastName = string.nextLine();

      //  System.out.println(  UserDetailNoDublication.printUserName(fistName, lastName));

UserInformtionStatic.printCurrentDate();


    }
}
