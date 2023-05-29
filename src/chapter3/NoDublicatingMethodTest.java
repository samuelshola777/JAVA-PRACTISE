package chapter3;

import java.util.Scanner;

public class NoDublicatingMethodTest {
    public static void main(String[] args) {
        NoDublicatingMethod account1 = new NoDublicatingMethod("samuel shola",16500);
        NoDublicatingMethod account2 = new NoDublicatingMethod("boneshaker",17500);
        Scanner input = new Scanner(System.in);



      account2.setName(input.nextLine());
displayAccountDetails(account2);
displayAccountDetails(account1);
    }
    public static void displayAccountDetails(NoDublicatingMethod account){

        System.out.println(account.getName()+"\n "+account.getBalance());

    }


}
