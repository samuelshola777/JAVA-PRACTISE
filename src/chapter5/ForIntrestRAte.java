package chapter5;

public class ForIntrestRAte {
    public static void main(String[] args) {

        double pricipal = 1000.0;

        double rate = 0.05;
        System.out.printf("%s %20s%n", "years", "Amount on deposit");


        for (int year = 1; year <= 10 ; ++year){

            double amount = pricipal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%, 20.2f%n ", year , amount);
        }

    }
}
