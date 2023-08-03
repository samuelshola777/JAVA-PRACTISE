package leetCode;

import java.util.Arrays;

public class IndexOfTwoSum {
    public static int[] indexOfSum(int[] number, int target){
        int counter = 0;
        int sum = 0;
       while (true){
           counter++;
           for (int i = 0; i < number.length; i++){
               sum =  number[counter] + number[i];
               if (sum == target){
                   if (i == counter){
                       continue;
                   }
                   return new int[] { i, counter };
               }}

        }
    }

    public static void main(String[] args) {

        int [] numbers = {2,5,5,11};
        System.out.println(Arrays.toString(indexOfSum(numbers, 10)));


    }



}
