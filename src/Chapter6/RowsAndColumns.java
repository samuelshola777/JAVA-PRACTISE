package Chapter6;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.Locale;
import java.util.Scanner;

public class RowsAndColumns {
static     Scanner scanner = new Scanner(System.in);
static     Scanner scanner1 = new Scanner(System.in);
    public static void printStarColumn(){

        System.out.println("Enter number of rows and columns of Stars ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } public static void printAnyInput(){
        System.out.println("Enter number  of rows and columns of Stars ");
        int number = scanner.nextInt();
        System.out.println("Enter   char to display ");
       String numbero = scanner1.next();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number ; j++) {
                System.out.print(numbero);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

      printStarColumn();
        printAnyInput();

    }

}
