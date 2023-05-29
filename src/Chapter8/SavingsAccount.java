package Chapter8;

public class SavingsAccount {
    private static double annualIntrestRate = 0.04;
    private double savingBalance;

    private static double monthlyIntrestSavingBalance;


    public String deposit(double depositAmount){
        if (depositAmount > 0.0){
        this.savingBalance  += depositAmount;
        }
        return "deposit successful";
    }

    public String calculateIntrestRate(){
        double monthlyRate = (savingBalance * annualIntrestRate)/ 12;
        monthlyIntrestSavingBalance += monthlyRate;
        return String.format("""
               Monthly intrest Rate ==>>> %.2f \n
               ---------------------------------->>>>.
               Monthly Balance Intrest Rate ==>>>>  %.2f \n 
                """, monthlyRate, monthlyIntrestSavingBalance);
    }

    public static double modifyIntrestRate(int change){
        if (change >= 10) {
            annualIntrestRate = 0.05;
            return annualIntrestRate;
        }
        return annualIntrestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }


    public static void main(String[] args) {

        SavingsAccount account1 = new SavingsAccount();

        SavingsAccount account2 = new SavingsAccount();

        account1.deposit(2000.00);

        System.out.println(" this is \n "+account1.calculateIntrestRate());
        System.out.println();
      modifyIntrestRate(10);
        System.out.println(" this is change \n"+account1.calculateIntrestRate());

        account2.deposit(3000);
        System.out.println(" this is change2  \n"+account1.calculateIntrestRate());

    }
}
