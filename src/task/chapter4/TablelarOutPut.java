package task.chapter4;

import java.util.Scanner;

public class TablelarOutPut {

    public static void tableOutPut(int index){
        System.out.println("N    N2    N3    N4");
            for (int j = 1; j <= index; j++) {

                System.out.println(j + "     " + j * j +"     " + j * j*j +"     "+j*j*j*j);

            }

    }

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);


            System.out.println("please enter number of tables you wanna multiply");
            int table = scanner.nextInt();
            tableOutPut(table);

            System.out.println("""
            to continue press yes or press no to Exit
            """);
            String control = scanner1.nextLine();
            if (control.equals("yes"))continue;
            break;
        }


    }

}
