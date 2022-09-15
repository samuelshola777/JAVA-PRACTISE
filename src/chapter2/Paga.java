package chapter2;

public class Paga {
    private int balance;

    public void depositInto(String acctNumber, int amount) {
        if (acctNumber != null) { balance += amount;}
        System.out.println("Deposit successful");
    }

    public int getBalance() {
        System.out.println("Your account balance is " + balance);
        return balance;
    }

    public void withdraw(int amount, String pin) {
        if(pin != null){ balance -= amount; }
        System.out.println("Withdraw successful");
    }

}
