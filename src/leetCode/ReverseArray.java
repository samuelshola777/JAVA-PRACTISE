package leetCode;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] array){
        int[] arrayCopy = new int[array.length];
        int count = 0;
        for (int i = array.length-1; i > 0; i--) {
            arrayCopy[count] =  array[i] ;
    count++;
       }
 return arrayCopy;
    }

    public static void main(String[] args) {
        int [] numberArray = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(numberArray)));
    }



}
