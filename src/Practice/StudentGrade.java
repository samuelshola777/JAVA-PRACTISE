package Practice;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
   int gradeA = 0;
   int gradeB = 0;
    int gradeC = 0;
    int gradeD = 0;

for (int counter = 0; counter < 5;counter++){

    System.out.println(" please enter grade");
    String Grade = input.nextLine();

    switch (Grade){
        case "A" :
            gradeA ++;
            break;
        case  "B":
            gradeB ++;
            break;
        case "C":
            gradeC++;
            break;
        default:
        case "D":
            break;


    }

}
    System.out.println("gradeA is "+gradeA);
        System.out.println("gradeB is "+gradeB);
        System.out.println("gradeC is "+gradeC);
        System.out.println("gradeD is "+gradeD);

}
}
