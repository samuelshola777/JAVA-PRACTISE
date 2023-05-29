package chapter3;
import java.util.Scanner;

public class BankAccountTest {

    private String name;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Clock clock = new Clock();



        System.out.println("this hour   ()-> "+clock.getMinutes());
        Account Account1 = new Account("sambone", 5000);
        Account Account2 = new Account("Boneshaker", -700);
        Account1.setName("samuelshola");

        System.out.println("your account name is " + Account1.getName() + "\nand your account balance is   " + Account1.getBalance());
        System.out.println();
        System.out.println("your second account name is " + Account2.getName() + " \n and your account balance is  " + Account2.getBalance());
        System.out.println();


        System.out.println();
        System.out.println();

        System.out.println("welcome to our little deposit function\n" +
                "press anything to make some deposit");
        var anythin = input.nextLine();

        System.out.println("enter amount to deposit for account1:  ");
        double depositAmount = input.nextDouble();
        Account1.deposit(depositAmount);

        System.out.println(Account1.getBalance());

    }
}