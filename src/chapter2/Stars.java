package chapter2;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
       // System.out.printf(" ****%n ******%n*******%n ******%n ****%n");
        Scanner input = new Scanner(System.in);

        System.out.println("***********   "+"##################");
        System.out.println("*         *   "+"#                 #");
        System.out.println("*         *   "+"#                 #");
        System.out.println("*         *   "+"#                 #");
        System.out.println("*         *   "+"#                 #");
        System.out.println("*         *   "+"#                 #");
        System.out.println("*         *   "+"#"              +"#");
        System.out.println("*         *   "+"#                 #");
        System.out.println("***********   "+"# @#$%^&*()_+++++++");
        System.out.println("      ******   "+"                                 * ");
        System.out.println("    *       *"+"                                  ***");
        System.out.println("  *          * "+"                               *****");
        System.out.println(" *            * "+"                           ************ ");
        System.out.println(" *            *"+"                           **************");
        System.out.println(" *            * "+"                     ***********************");
        System.out.println(" *            * "+"                            ***********");
        System.out.println(" *            * "+"                            ***********");
        System.out.println("  *           *"+"                             ***********");
        System.out.println("   *         *"+"                              ***********");
        System.out.println("    ******"+"                                  ***********");
        System.out.println("                                           ***********");
        System.out.println("                                           ***********");
        System.out.println("                                           ***********");
        System.out.println("                                           ***********");
        System.out.println("            *           ");
        System.out.println("          *    *");
        System.out.println("         *      *");
        System.out.println("        *        *");
        System.out.println("        *         *");
        System.out.println("        *         *");
        System.out.println("        *         *");
        System.out.println("        *         *");

        System.out.printf("%s%n%s%n%s%n%s%n", " *", " ***", "*****", " ***", " *");

        System.out.println("please enter your numbers");
        int goat = input.nextInt();

        System.out.printf("%d  %n ,   %n%d,   %n%d,   %n%d", goat);

    }
}
