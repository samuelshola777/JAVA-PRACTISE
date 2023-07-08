package codeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDiffRemoveNonRepeatedValue {

//    assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
//    assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {1}));
//    assertArrayEquals(new int[] {1}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {2}));
//    assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {}));
//    assertArrayEquals(new int[] {}, Kata.arrayDiff(new int [] {}, new int[] {1,2}));
//}


//    Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//    It should remove all values from list a, which are present in list b keeping their order.
//
//            Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//    If a value is present in b, all of its occurrences must be removed from the other:
//
//            Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}


    public static  boolean ifExist(int number, int[] array){
        for (int i = 0; i < array.length ; i++) {
            if (number != array[i]) return true;
        }
        return false;
    }

     static List<Integer> removeNonRepeatedValue(int[]firstArray, int[]secondArray){
       int numArray = 0;
        List<Integer> result = new ArrayList<>();
         for (int i = 0; i < firstArray.length; i++) {
                 if (!ifExist(secondArray[i],firstArray)){

                     result.add(secondArray[i]);
                 }

         }
         return result;
    }

    private static class PeterSolution {
        static ArrayList<Integer> result = new ArrayList<>();
        private static ArrayList<Integer> arrDiff(int[] a, int[] b){
            for (int j : a) result.add(j);
            for (int k : b) {
                for (int i = 0;  i < result.size() - 1; i++){
                    if (k == result.get(i)) result.remove(result.get(i));
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int [] firstArray = {55, 7 , 77, 55, 1 , 20 , 66, 6, 9, 8};
        int [] secondArray = {55, 77,7, 66, 20};


        System.out.println(PeterSolution.arrDiff(firstArray, secondArray));
      // System.out.println(removeNonRepeatedValue(secondArray, firstArray).toString());



    }
}
