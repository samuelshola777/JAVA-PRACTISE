package chapter5;

public class ForSum {
    public static void main(String[] args) {

        int total = 0;

        for (int number = 2; number <= 20; number += 2 ){

            total += number;
        }
        System.out.printf("your total sum is  %d", total);
    }
}
