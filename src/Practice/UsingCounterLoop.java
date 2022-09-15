package Practice;

import java.util.Scanner;

public class UsingCounterLoop {
    public static void main(String[] args) {

       int gradeCounter =1;
      int total = 0;
        Scanner input = new Scanner(System.in);
    while (gradeCounter <= 10) {
        System.out.println("enter grade");
        int grade = input.nextInt();
        total = total + grade;
        gradeCounter++;


    }
        int average = total / 10;
        System.out.printf("%n total of all 10 grade is %d%n", total );
        System.out.printf("class average is %d%n", average);

    }
}
