package chapter9.OopEmployee.bookHiierarchy;

public class BookMain {
    public static void main(String[] args) {


EBook eBook = new EBook("how to program","2022","samuelShola" );

        System.out.println(eBook.toString());

 AudioBook audioBook = new AudioBook("Segun Samuel","2023","how to requier wisdom");
        System.out.println(audioBook.toString());

  NoteBookPepper noteBookPepper = new NoteBookPepper("ellia books","2023","the journey of life");

        System.out.println(noteBookPepper.toString());

    }
}
