package PracticeMart;

import java.util.Scanner;

public class addOneToVariable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("let's test the method together ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        varible(num1, num2, num3);
    }
    public static void varible(int num1, int num2 , int num3){
            int addOne = 0;

            if (num1 > 50) {
                addOne++;
            } if (num2 > 50){
                addOne++;
            }  if (num3 > 50){
                addOne++;
            }
        System.out.println(addOne);
    }
}
