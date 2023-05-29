package Chapter6;

import java.util.Scanner;

public class DivisibleBy5 {
    private boolean divisible;
Scanner scanner = new Scanner(System.in);
    public boolean isDivisibleBy5(int number) {
        if (number % 5 == 0) divisible = true;
        return divisible;
    }

    public void displayMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("enter number");
        int number = scanner.nextInt();
            if (isDivisibleBy5(number)) {
                System.out.printf("""
                        The number %d is divisible by 5   <--     
                               """,number);
            }
           System.out.printf("""
                    -->    The number %d is not divisible by 5        
                               """,number);
        }
    }

    public static void main(String[] args) {
        DivisibleBy5 divisible1 = new DivisibleBy5();
        divisible1.displayMethod();

    }
}
