package Practice;

public class MiniDies {
    private double balance;

    private String name;

    private  int age;

    public void setname(String userName){
        this.name = name;
    }
    public void setage(int age) {
        if (age >= 18) {
            this.age = age;
        }
    }

        public void setbalance(int amountDeposit){
            if (amountDeposit > 0){
                balance = amountDeposit + balance;

            }
        }

        public String getName(){
        return name;
        }
        public int getAge(){
        return  age;
        }

        public double getBalance(){
        return balance;
    }


    }

