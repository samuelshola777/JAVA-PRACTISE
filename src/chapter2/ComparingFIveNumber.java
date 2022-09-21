package chapter2;

import java.util.Scanner;

public class ComparingFIveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bigN =0;

        System.out.println("please enter number 1");
        int n1 = input.nextInt();

        System.out.println();

        System.out.println("please enter number 2");
        int n2 = input.nextInt();

        System.out.println();


        System.out.println(" please enter number 3");
        int n3 = input.nextInt();
        System.out.println();


        System.out.println("please enter number 4");
        int n4 = input.nextInt();
        System.out.println();

        System.out.println("please enter number 5");
        int n5 = input.nextInt();


        int large = Math.max(n1, Math.max(n2, n3));

        int Large = Math.max(n4, n5);


        if (large > Large ){
            large = Large;

        } else if (Large > large) {
            large = Large ;
        }
        System.out.println("the largest number is: "+ Large);
    }
}
