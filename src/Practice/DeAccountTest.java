package Practice;
import  java.util.Scanner;
public class DeAccountTest {
    public static void main(String[] args) {

        Scanner inpunt = new Scanner(System.in);
        while (true) {
            System.out.println("hi welcome to Bukola bank\n" +
                    "where you have access to two account object\n" +
                    "for account 1 press 1 \n" +
                    "for account 2 press 2 ");
            int begining = inpunt.nextInt();



        switch (begining) {
case 1 ->
            DeAccount.displayAccount1();
case 2 ->
    DeAccount.displayAccount2();
        }
        }
    }
}