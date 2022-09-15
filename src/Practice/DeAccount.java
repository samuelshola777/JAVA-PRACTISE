package Practice;

public class DeAccount {

    private double balance;
    private String name;

  public DeAccount (String name, double balance)    {
        this.name= name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }




public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
}
    public String getName() {
        return name;
    }
 public double getBalance() {
      return balance;
 }



}
