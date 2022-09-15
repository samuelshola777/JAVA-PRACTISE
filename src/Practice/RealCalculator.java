package Practice;

import java.util.Scanner;

public class RealCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("hi,\nhow are you doing today. \nWelcome to void calculator\n\n");
            System.out.println("here are some options\n" +
                    "**PRESS:1 ADDITION \n" +
                    "**PRESS:2 SUBTRACTION \n" +
                    "**PRESS:3 MULTIPLICATION \n" +
                    "**PRESS:4 DIVISION \n" +
                    "**PRESS:5 TO PERFORM RAISE TO A POWER \n" +
                    "99 to exit");
            int responds = input.nextInt();
            if (responds == 99) {
                break;
            }

            switch (responds) {

                case 1:
                    while (true) {
                        System.out.println("please enter your first addition number");
                        int number1 = input.nextInt();

                        System.out.println("please enter your next addion number");
                        int number2 = input.nextInt();

                        int add = number1 + number2;

                        System.out.println(" your total addition is " + add + " " +
                                "\n\npress 700 to continue addition\n" +
                                "press 900 to go back to the main menu.");
                        int feedback = input.nextInt();

                        if (feedback == 700) {
                            continue;
                        } else if (feedback == 900) {
                            break;
                        } else if (feedback != 900 || feedback != 700) {
                            break;
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("please enter your number");
                        int sub1 = input.nextInt();

                        System.out.println("sutracted from what value");
                        int sub2 = input.nextInt();

                        int subtraction = sub2 - sub1;

                        System.out.println("your total subtraction is  " + subtraction + "\n\n" +
                                "press 700 to continue subtraction\n" +
                                "press 900 to go back to the main menu.");
                        int takeBake = input.nextInt();

                        if (takeBake == 700) {
                            continue;
                        } else if (takeBake == 900) {
                            break;
                        } else if (takeBake != 900 || takeBake != 700) {
                            break;
                        }

                    }
                case 3:
                    while (true) {
                        System.out.println("please enter your number here: ");
                        int multi1 = input.nextInt();

                        System.out.println("multiply by what value");
                        int multi2 = input.nextInt();

                        int multiplication = multi2 * multi1;

                        System.out.println("your total multiplication is  " + multiplication + "\n\n" +
                                "press 700 to continue multiplicatio\n" +
                                "press 900 to go back to the main menu.");
                        int result = input.nextInt();

                        if (result == 700) {
                            continue;
                        } else if (result == 900) {
                            break;
                        } else if (result != 700 || result != 900) {
                            break;
                        }
                    }

                case 4:
                    while (true) {
                        System.out.println("please enter your number");
                        double div1 = input.nextInt();

                        System.out.println("divide by what value");
                        double div2 = input.nextInt();

                        double division = div1 / div2;

                        System.out.println("your  total division is  " + division + "\n\n" +
                                "press 700 to perform another division\n" +
                                "press 900 to go back to the main menu");
                        int Division = input.nextInt();
                        if (Division == 700) {
                            continue;
                        } else if (Division == 900) {
                            break;
                        } else if (Division != 700 || Division != 900) {
                            break;
                        }

                    }
                case 5:
                    while (true) {
                        System.out.println(" please enter your number ");
                        int raise1 = input.nextInt();

                        System.out.println("raise to power of what");
                        int raise2 = input.nextInt();

                        System.out.println("your result is  " + Math.pow(raise1, raise2) + "\n\n" +
                                "press 700 to perform raise to the power of\n" +
                                "press 900 to go back to the main menu.");
                        int power = input.nextInt();

                        if (power == 700){
                            continue;
                        } else if (power == 900) {
                            break;
                        } else if (power != 700 || power != 900) {
                            break;
                        }

                    }
                default:
            }
            }
        }

        }







