package Python;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int total = 0;
        System.out.println("please enter a number:  ");
        int num = input.nextInt();
        for (int i = 1; i < num; i++){
            if (num% i == 0){
                System.out.println(i);

        total = total + i;
            }
        }
        System.out.println(total);

        if (total == num){
            System.out.println(" equall to");
        }else System.out.println("not equall to");
    }
}
