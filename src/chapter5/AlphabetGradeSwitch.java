package chapter5;

import java.util.ArrayList;
import java.util.List;

public class AlphabetGradeSwitch {
    private String studentName;
    private String studentGrade;
   static int  count = 0;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        AlphabetGradeSwitch.count = count;
    }

    public AlphabetGradeSwitch(String studentName, String studentGrade) {
        count++;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "AlphabetGradeSwitch{" +
                "studentName='" + studentName + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<AlphabetGradeSwitch> studentList = List.of(
         new AlphabetGradeSwitch("SAMUEL-SHOLA","A"),
         new AlphabetGradeSwitch("HANEFAHT","C"),
         new AlphabetGradeSwitch("PRIECIOUS","B"),
         new AlphabetGradeSwitch("TOMISON","A"),
         new AlphabetGradeSwitch("BRUCE","B"),
         new AlphabetGradeSwitch("SAMUEL-SEGUN","D")
        );
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;





        System.out.println("this is  count  "+getCount());

        for (int i = 0; i < studentList.size(); i++) {
        switch (studentList.get(i).getStudentGrade()) {
            case "A" : A++;
            break;
            case "B" : B++;
                break;
            case "C" : C++;
                break;
            case "D" : D++;
            default:
        }
//            if (studentList.get(i).getStudentGrade().equals("A")) {
//                A++;
//            }else if (studentList.get(i).getStudentGrade().equals("B")){
//                B++;
//            }else if(studentList.get(i).getStudentGrade().equals("C")){
//                C++;
//            }else if(studentList.get(i).getStudentGrade().equals("D")){
//                D++;
//            }
        System.out.println("this is the list of student "+studentList.get(i));
        }

        studentList.stream().filter(student -> student.getStudentGrade().equals
                ("A"));
        A++;
        studentList.stream().filter(student ->
                student.getStudentGrade().equals("B"));

        System.out.println("NUMBER OF STUDENT THAT GOT A "+ A);
        System.out.println("NUMBER OF STUDENT THAT GOT B "+ B);
        System.out.println("NUMBER OF STUDENT THAT GOT C "+ C);
        System.out.println("NUMBER OF STUDENT THAT GOT D "+ D);

    }
}
