package Chapter4;

public class StudentTest {

    public static void main(String[] args) {
        Student account1 = new Student("jane Green",93.0);
        Student account2 = new Student("john blue", 72.25);


        System.out.println("letter grade is: "+account1.getName()+
                " "+account1.getletterGrade());
        System.out.println();

        System.out.println("letter grade is:  "+account2.getName()+
                " "+account2.getletterGrade());


    }
}
