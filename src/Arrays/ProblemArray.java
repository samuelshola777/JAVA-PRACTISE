package Arrays;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



public class ProblemArray {
    public static void main(String[] args) {

        Scanner response = new Scanner(System.in);
        Scanner english = new Scanner(System.in);

        ArrayList<String> listProblem = new ArrayList<>();

        String feedBack;
        for (int i = 0; true; ) {


            System.out.println("please enter your problem \n");
            String inputProblem = english.nextLine();

            listProblem.add(inputProblem);

            System.out.println("okay your problem has been received  \n" +
                    " we'll think about your problem\n" +
                    " if it's something we'll have to call chibuzo for or not \n" +
                    "SO do you have any other problem ?\n \n" +
                    "-->if yes press enter YES \n" +
                    "----->if no enter NO");
            feedBack = response.nextLine();
            if (!feedBack.equals( "yes")) {

           System.out.println("these are you current problem \n\n");

            System.out.println(listProblem.toString());

break;
        }

    }
}
}