package chapter2;

import java.util.Scanner;

public class ComparingNumer2o15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter number");
        int bone = input.nextInt();

       if (bone > 100){
           System.out.println("your number is greATer than 100");
       } else if (bone < 100) {
           System.out.println("your number is leeser than 100");
       } else if (bone == 100) {
           System.out.println("your number is equals to 100");
       }
        System.out.println();
int bone1 = bone * bone;

if (bone1 > 100){
    System.out.println("the square of your number is greater than 100");
} else if (bone1 <100) {
    System.out.println("the square of the number is lesser than 100");
} else if (bone1 == 100 ) {
    System.out.println("the square of the number is equals to 100");
}

    }

}
