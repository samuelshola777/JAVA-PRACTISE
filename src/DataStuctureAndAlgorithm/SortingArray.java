package DataStuctureAndAlgorithm;

import java.util.Arrays;

public class SortingArray {

    public static int[] sort(int[] array){
    int[] array1 = new int[array.length];
    int number1 = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
              if ( array[i] > array1[j]){
                  number1 = array[i];
                  array[i] = array[j];
                  array[i] = number1;
              }
            }

        }
        return array;
    }

    public static void main(String[] args) {

        int[] number = {8, 97, 90 , 12, 9, 4, 1 , 6};

      System.out.println(Arrays.toString(sort(number)));

    }

}
