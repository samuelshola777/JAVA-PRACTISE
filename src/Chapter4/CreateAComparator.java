package Chapter4;

import java.util.Scanner;

public class CreateAComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter two number ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.println("000");
        } else if (num1 == num2) {
            System.out.println("11111");
        } else if (num2 >  num1) {
            System.out.println("---1111");
        }

        System.out.printf("%s", num1 > num2 ? "000": num1 == num2 ? "111" : num2 > num1 ? "-111": "999");
    }
}
