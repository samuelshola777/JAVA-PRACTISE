package Chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int sam = 0;
        int boneshaker = 5;
        int num = 5;
        int num2 = 0;
        int couter = 4;

        for (int i = 0; i < num ; i++) {
            num2 += num * boneshaker--;
            System.out.println(num);
        }
        System.out.println();
        System.out.println(num);


    }
}
