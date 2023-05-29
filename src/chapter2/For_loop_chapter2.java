package chapter2;

import java.util.Scanner;

public class For_loop_chapter2 {
    public  static  void numberSquareCube(){

        Scanner input = new Scanner(System.in);

        System.out.println("please input ");
        int num = input.nextInt();

        int counter = 1;
        System.out.println("number   square    cube");
        while (num > counter){
            num--;
int square = num * num;
int cube = square * num;
            System.out.printf("%5d%7d%9d%n",num,square,cube);

        }
        System.out.println("<-------------------------------------->");



    }

    public static void main(String[] args) {

        numberSquareCube();

        System.out.println("number   square    cube");

        for (int times = 0; times < 11; times++){

            int multiple = times * times;

            int raise = multiple * times;

            System.out.printf("%4d%7d%10d%n",times,multiple,raise);
        }
    }
}
