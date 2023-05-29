package Python;

public class Account_class {

    private double withdraw;
    private  String name;
    private  double balance;

    private double deposit;

    public Account_class(String name, double balance, double deposit, double withdraw){
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
        if (deposit > 0.0){
            balance = deposit + balance;
            this.deposit = deposit;
        }

        if (withdraw > 0.0){
            this.withdraw = withdraw;
        }
    }
    public void setDeposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = depositAmount + balance;
        }
        this.deposit = deposit;
    }
    public void setWithdraw(double amountWithdraw){
        if (amountWithdraw > 0.0){
            withdraw = amountWithdraw - balance;
          this.withdraw = withdraw;
        }
    }
    public void setBalance(double amountDeposit){
        if (amountDeposit > 0.0){
            this.balance = balance;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public double getDeposit(){
        return deposit;
    }


}
