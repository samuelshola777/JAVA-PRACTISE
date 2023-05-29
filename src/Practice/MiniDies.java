package Practice;

public class MiniDies {
    private double balance;

    private String name;

    private  int age;

    private int guess;

    private int win;

    private int lose;
    public void setLose() {
        double lost = 0.20 * this.balance;
        this.balance -= lost;
    }

    public void setguess( int guess){
        this.guess = guess;
    }
    public void setname(String userName){
        this.name = name;
    }
    public void setage(int age) {
        if (age >= 18) {
            this.age = age;
        }
    }
    public void setWin(double balance){
        double win = 0.20 * balance;
        this.balance += win;
    }

        public void setbalance(int amountDeposit){
            balance = amountDeposit;
                    }

        public int getGuess(){
        return guess;
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



    public int getWin(){
        return win;
    }
    public int getLose(){
       return lose;

    }

    }

