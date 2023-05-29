package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReturnIndex {
    public static void main(String[] args) {
        int target = 91;
        int temp = 0;
        int[] numberArray = {5, 6,90, 22,4, 1, 70};
       int[] numZ = new int[2];
        for (int i = 0; i < numZ.length; i++) {
        for (int j = 0; j < numberArray.length ; j++) {
            if (numberArray[i] + numberArray[j] == target) {
           temp = j;
           numZ[i]= temp;
}
            System.out.print(numZ[j]+" ");
            }



        }




    }
}
