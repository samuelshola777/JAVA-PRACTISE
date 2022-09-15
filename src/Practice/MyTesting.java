package Practice;

import java.util.Scanner;

public class MyTesting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("please enter number");
            int sam = input.nextInt();
            if (sam < 18) {
                System.out.println("please number is too low ");

                continue;
            } else if ( sam >= 18) {
                System.out.println("my name is samuel shola");
              break;
            }

        }
        }

        }

