package Chapter4;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int raise = 0;
        int count = 0;
        System.out.println("enter num number ");
        int num = scanner.nextInt();

        while (num != 0){
            int mod = num % 10;
            raise += mod * Math.pow(2, count);
            num /= 10;
            count++;
        }
        System.out.println(raise);



    }
}
