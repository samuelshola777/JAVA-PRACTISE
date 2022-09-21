package chapter2;

import java.util.Scanner;

public class TheRemainderSIgn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input your number");
        int num = input.nextInt();

        num = num / 3;

     int numd = 0 % num ;

        System.out.println(numd +"\n my is "+ num);
    }
}
