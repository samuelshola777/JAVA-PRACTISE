package Python;

import java.util.Scanner;

public class speelingNumber {
    private String one;

    public static void setNumber(String one) {
        System.out.println(one);
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("please enter number frm one to 10");
            int number1To10 = input.nextInt();

            System.out.println(spellNumber((number1To10)));

        }

    }

    private static String spellNumber(int number1To10) {
        switch (number1To10) {
            case 1:
                if (number1To10 == 1) {
                    return "one";
                }
                break;
            case 2:
                if (number1To10 == 2) {
                    return "two";
                }
                break;
            case 3:
                if (number1To10 == 3) {
                    return "three";
                }
                break;
            case 4:
                if (number1To10 == 4) {
                    return "four";
                }
                break;
            case 5:
                if (number1To10 == 5) {
                    return "five";
                }
                break;
            case 6:
                if (number1To10 == 6) {
                    return "six";
                }
                break;
            case 7:
                if (number1To10 == 7) {
                    return "seven";
                }
                break;
            case 8:
                if (number1To10 == 8) {
                    return "eight";

                }
                break;
            case 9:
                if (number1To10 == 9) {
                    return "nine";
                }
                break;
            case 10:
                if (number1To10 == 10) {
                    System.out.println("ten");
                }
                break;
            default:

        }

        return null;
    }

}
