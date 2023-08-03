package chapter2;

import java.util.Scanner;

public class MultipleNumberRaiseToThePower {
    public static void multiple(){
        Scanner input = new Scanner(System.in);

        System.out.println("please enter first interger: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

      int numRaiseBY3 = num1 * num1 * num1;
        int numRaiseBy2 = num2 * num2;

        if (numRaiseBy2 % numRaiseBY3 == 0){
            System.out.println("it's a multiple");
        }else {
            System.out.println("it's not a multiple");
        }
    }

    public static void main(String[] args) {

        
        multiple();
    }
}
