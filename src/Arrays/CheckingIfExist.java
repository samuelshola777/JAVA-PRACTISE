package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckingIfExist {
    public static void main(String[] args) {
        int[] wunmiArray = {89, 90, 35, 12, 2};

        ArrayList<Integer> smile = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int sam = in.nextInt();

        for (int i = 0; i < wunmiArray.length; i++) {

            if (wunmiArray[i] == sam){
                System.out.println(true);
            }else {
                System.out.println(false);
            }

        }

    }
}
