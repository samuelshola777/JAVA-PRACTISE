package chapter3;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account Account1 = new Account("sambone", 5000 );
      Account Account2 = new Account("Boneshaker", - 700);

        System.out.println("your account name is " + Account1.getName() +" "+ Account1.getBalance());
        System.out.println();
        System.out.println("your second account name is " + Account2.getName()+ " "+ Account2.getBalance());
        System.out.println();
        System.out.println("please deposit some amount into Account1");
        double depositAmount = input.nextDouble();
        System.out.println(depositAmount);


    Account1.deposit(depositAmount);

        System.out.println(Account1.getName()+" "+Account1.getBalance());
        System.out.println();
        System.out.println(Account2.getName()+ " "+Account2.getBalance());
        System.out.println();
        System.out.println("please deposit some amount into Account2");
         depositAmount = input.nextDouble();
        System.out.println();
        System.out.println("the amount deposit " + depositAmount);
         Account2.deposit(depositAmount);

        System.out.println("your  account name is : "+Account1.getName()+" your account balace : "+Account1.getBalance());
        System.out.println();
        System.out.println(" your account name is : "+Account2.getName()+" your account name is : "+Account2.getBalance());
    }
}
