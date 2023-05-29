package Practice;

import java.util.Locale;
import java.util.Scanner;

public class studentGrade {
    public static void grade() {
        Scanner input = new Scanner(System.in);
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int times = 0; times < 4; times++) {

            System.out.println("please enter grade from grade 60 to 100 ");

            int grade = input.nextInt();

            if (grade >= 90 && grade < 100) {
                gradeA ++;
                System.out.println("your score is in the range of 90 - 100 and your grade is A");
                System.out.println("<------------------------------------------------------------>");

            } else if (grade >= 80 && grade <= 89) {
                gradeB ++;
                System.out.println("your score is in the range of 80 - 89 and your grade is B");
                System.out.println("<------------------------------------------------------------>");

            } else if (grade >= 70 && grade <= 79) {
                gradeC ++;
                System.out.println("your score is in the range of 70 - 79 and your grade is C");
                System.out.println("<------------------------------------------------------------>");

            } else if (grade >= 60 && grade <= 69) {
                gradeD ++;
                System.out.println("your score is in the range of 60 - 69 and your grade is D");
                System.out.println("<------------------------------------------------------------>");

            }

            }
        System.out.println("grade A = "+gradeA);
        System.out.println("grade B = "+gradeB);
        System.out.println("grade C = "+gradeC);
        System.out.println("grade D = "+gradeD);
        }



    public static void main(String[] args) {

        studentGrade.grade();

}
}
