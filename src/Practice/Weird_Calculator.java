package Practice;

import java.util.Scanner;

public class Weird_Calculator {
    public static void divid(int goat, int me){
        int bone = goat/ me;
        System.out.println(bone);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter number");
        int simi = input.nextInt();
        int fool = input.nextInt();

        Weird_Calculator.divid(simi,fool);
    }
}
