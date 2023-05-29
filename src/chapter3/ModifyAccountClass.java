package chapter3;

import java.util.Scanner;

public class ModifyAccountClass {
    private  String name;
    private int balance;
    private int deposit;
    private int withdraw;


    public  void setName(String accountName){
        this.name = accountName;
    }
    public void setDeposit(int depositAmount){
        if (depositAmount > 0){
             balance = balance + depositAmount ;
        }
//        this.deposit = balance;
    }
//    public void setBalance(int depositAmount){
//        if (depositAmount > 0){
//            balance = balance + depositAmount ;
//        }
//        this.balance = depositAmount;
//    }
    public void setWithdraw(int amountWithdraw) {
        if (amountWithdraw < balance) {
            balance =  balance - amountWithdraw ;
        }
//        this.withdraw = amountWithdraw;
    }
    public String getName(){
        return name;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getBalance() {
        return balance;
    }

    public int getWithdraw() {
        return withdraw;
    }


    public static void main(String[] args) {

        ModifyAccountClass bank = new ModifyAccountClass();
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        while (true){

            System.out.println("<<------------------------>>" +
                    "\nwelcome to SS bank\n" +
                    "create account with us enter any number to proceed\n\n" +
                    "to create an account name press 1\n" +
                    "to view balance press press 2\n" +
                    "to make deposit press 3\n" +
                    "to view account balance press 4\n" +
                    "to make withdrawal press 5\n" +
                    "");
                    int control = input.nextInt();
switch (control) {
    case 1 : System.out.println("please enter account name :");
             bank.setName(string.nextLine());
    System.out.println("your account name has been saved\n700 to go back to the main menu");
    control = input.nextInt();
    if (control == 700 ){
        continue;
    }
    break;
    case 2 :
        System.out.println("your account name is "+ bank.getName());

    System.out.println("\n700 to go back to the main menu");
    control = input.nextInt();
    if (control == 700 ){
        continue;
    }
    break;
    case 3 :
        System.out.println("enter amount to deposit ");
        bank.setDeposit(string.nextInt());


        System.out.println("DEPOSIT successful\n700 to go back to the main menu");
        control = input.nextInt();
        if (control == 700 ){
            continue;
        }
break;
    case 4:
        System.out.println("your present account name is "+bank.getName()+"\n" +
                "and your account balance is  #"+bank.getBalance()+"");
        System.out.println("press 700 to go back to the main menu");
        control = input.nextInt();
        if (control == 700 ){
            continue;
        }
        break;
    case 5:
        System.out.println("enter with amount");
        int amountWithdraw = input.nextInt();
        bank.setWithdraw(amountWithdraw);

        System.out.println("withdrawal successful\n press 700 to go back to main menu");
        control = input.nextInt();
        if (control == 700 ){
            continue;
                    }
        break;
}
        }

    }
}
