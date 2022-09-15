package Practice;

public class paga {

    private double balance;
  //private double withdrawal;
//    private double Deposit;
    private double charges;


    public void setBalance(double balance){
        if (balance > 0.0) {
            this.balance = balance;
        }

    }
    public void setWithdraw(int amountWithdraw) {
        if (amountWithdraw < balance){
            balance =  balance - amountWithdraw;
        }
        }

     public void setDeposit(int amountDeposit){
         if (amountDeposit > 0){
             balance = balance + amountDeposit;
        }
}
    public void setCharges(int amountWithdral){
        charges = charges - amountWithdral;
    }
public double getWithdraw(){
        return balance;
}


    public double getBalance(){
       return balance;
        }



    public double getCharges(){
        return charges;
    }

//double deposit = amountDeposit + balance;

}








