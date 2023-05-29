package ClassWork;

import java.util.Arrays;

public class MultyDymentionalArray {
    public static void main(String[] args) {

        char[][] mutiRay = {{'X','O','X'},{'X','O','X'},{'X','X','O'}};

        for (int i = 0; i < mutiRay.length; i++) {
            System.out.print(" "+mutiRay[0][i]);


       }
        System.out.println();

       for (int i = 0; i < mutiRay.length; i++) {

            System.out.print(" "+mutiRay[1][i]);

        }
        System.out.println();

        for (int i = 0; i < mutiRay.length; i++) {

            System.out.print(" "+mutiRay[2][i]);

        }
        System.out.println();
//        System.out.println(Arrays.deepToString(mutiRay));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < mutiRay[i].length; j++) {

                System.out.print(mutiRay[i][j]+" ");

            }
            System.out.println();
        }

    }
}
