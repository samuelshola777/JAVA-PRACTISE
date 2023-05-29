package chapter2;

import java.util.Scanner;

public class RemainderOperation {

    public static void remaiderOperation(){

        Scanner input = new Scanner(System.in);

        System.out.println("please input an interger to che" +
                "ck \nif it can be devided by three with no remainder");
        int num = input.nextInt();

        if (num % 3 == 0){
            System.out.println("it can be devided by 3");
        }else {
            System.out.println("it can be devided by 3");
        }

    }

    public static void main(String[] args) {
        remaiderOperation();
    }
}
