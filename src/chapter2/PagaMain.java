package chapter2;

import java.util.Scanner;

public class PagaMain {
    static Paga paga = new Paga();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter account number: ");
        String acctNo = input.nextLine();

        System.out.println("Enter amount: ");
        int depositAmount = input.nextInt();

        paga.depositInto(acctNo, depositAmount);
        paga.getBalance();

        System.out.println("Enter amount to withdraw: ");
        int withdrawAmount = input.nextInt();

        System.out.println("Enter pin: ");
        String pin = input.nextLine();

        paga.withdraw(withdrawAmount, pin);
        paga.getBalance();

    }}
