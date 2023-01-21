package Python;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number and i'll print out if it's prime number");
        int prime = input.nextInt();

        boolean isPrime = true;
        for (int time = 2; time < prime; time ++) {

            if (prime % time == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("It is prime");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
