package chapter3;

public class NoDublicatingMethod {

    private String name;
    private double balance;


    public NoDublicatingMethod(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if (balance > 0.0) {
            this.balance = balance;
        }

    }







}
