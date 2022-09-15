package Practice;
 import java.util.Scanner;
public class pagaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        paga mypaga = new paga();
        int counter = 0;

        System.out.println("hi !!!! \n \nhow are you doing today? \n\n" +
                " how can we serve today\n\n" +
                "press 1  to check balance\n \npress 2 to make deposit \n\n" +
                "press 3 to make withdrawal, " +
                "there will be a 10% charge on every withdral" +
                "\n\npress 99 to exit ");
        double responds = input.nextInt();

        while (counter >=
                0) {
            counter++;

            if(counter != 1){
            System.out.println("hi !!!! \n \nhow are you doing today? \n\n how can we serve today\n\n" +
                    "press 1  to check balance\n \npress 2 to make deposit \n\n" +
                    "press 3 to make withdrawal, there will be a 10% charge on every withdral" +
                    "\n\npress 99 to exit ");
                responds = input.nextInt();
            }

//check balance
            if (responds == 1) {
                System.out.println("your current balance is : " + mypaga.getBalance()
                        + "  to perform other transaction please \n press 10 to continue" +
                        "\nelse press 99 to exit");
                responds = input.nextInt();
                continue;
            }
//to go back to homepage
            else if (responds == 10) {
                continue;
            }
// to enter the program
            else if (responds == 99) {
                System.out.println("thanks for using our mobile banking app" );
//                int endprogram = input.nextInt();
                break;
            }

// to deposit
            else if (responds == 2) {
                System.out.println("enter amount to deposit\n\n" +
                        " press 10 to go back \n\n press 99 to exit");
                int depositAmount = input.nextInt();
                mypaga.setDeposit(depositAmount);
            }
 // to make withdral
            else if (responds == 3) {
                System.out.println("enter amount to withdral\n\n" +"withdral succesfull"+
                               "your balance is  "+ mypaga.getBalance()+
                        "enter 10 to go back to homepage\n\n" +
                        "enter 99 to exit");
                int amountWithdral = input.nextInt();
                mypaga.setWithdraw(amountWithdral);
            }
        }

    }

}


