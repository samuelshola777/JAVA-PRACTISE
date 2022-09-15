package Practice;
import  java.util.Scanner;
public class DeAccountTest {
    public static void main(String[] args) {

 DeAccount account1 = new DeAccount("samuel", 90.00);
 DeAccount account2 = new DeAccount("shola" ,-7.53);

 Scanner input = new Scanner(System.in);

        System.out.println(account1.getName()+" "+account1.getBalance());
        System.out.println(account2.getName()+" "+account2.getBalance());

        System.out.println("please o deposit money");
        double depositAmount = input.nextDouble();

        account1.deposit(depositAmount);


      System.out.printf("Your account balance is: %.2f",account1.getBalance());
account1.deposit(depositAmount);
       // System.out.println(depositAmount);

        System.out.printf(account1.getName(),account1.getBalance());
        System.out.printf(account2.getName(),account2.getBalance());


    }
}
