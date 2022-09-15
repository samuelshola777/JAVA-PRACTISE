package Chapter4;

import java.util.Scanner;

public class ClassAverageNumberOfTimes {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Grade or enter -1 to quit");
        int grade = input.nextInt();

    while (grade != -1){
        total = total + grade;

        gradeCounter = gradeCounter +1;

        System.out.println(" please Enter grade  or enter -1 to continue");
        grade = input.nextInt();
    }

    if (gradeCounter != 0) {
        double average = (double) total / gradeCounter;

        System.out.printf("%nTotal of the %d grades entered is %d%n",
                gradeCounter, total);

        System.out.printf("Class average is %.2f%n", average);

    } else {
        System.out.println("No grades were entered");


    }
    }
}
