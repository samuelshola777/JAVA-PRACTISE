package DataStuctureAndAlgorithm;

import java.util.Arrays;

public class LinearSearchSAlgorithm {

    static int[] array2DSearch(int [][] number,int target){
        int[] result = new int[2];
        for (int row = 0; row < number.length ; row++) {
            for (int column = 0; column < number[row].length; column++) {
                if (number[row][column] == target) {
                   result[0] = row;
                   result[1] = column;
                    return result;
                }
            }
        }
        return result;
    }
    public static int largestAltitude(int[] arrayNum) {
        int higest = 0;
        for(int i = 0; i < arrayNum.length; i++){
            if ( arrayNum[i] > higest ){
                higest = arrayNum[i];
            }
        }
        return higest;

    }

    public static boolean linearSearch(int []numberArray, int number){
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == number){
                return true;
            }
        }
        return false;
    }
    public static int linearSearchL(int []numberArray, int number){
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == number){
                return i;
            }
        }
        return 0;
    }

    public static boolean stringLinearSearch(String word, char target){
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    public static int findMiniMumNumber(int[] arrayNumber){
        int result = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++) {
            if (  arrayNumber[i] < result) {
                result = arrayNumber[i];
            }
        }
        return result;
    }

    static int findMaxNumber(int[] arrayNumber){
        int result = arrayNumber[0];
        for (int i = 0; i < arrayNumber[i]; i++) {
            if  (arrayNumber[i] > result){
                result = arrayNumber[i];
            }
        }
        return result;
    }


    public static void main(String[] args) {

        int [] arrayZNumber = {-5,1,5,0,-7};

        System.out.println("()==>  "+ largestAltitude(arrayZNumber));


        int [][] arrayNumberZ = {   {45, 67, 99, 90, 12,34},
                                    {89, 65, 12, 1, 35}
                                    ,{99, 44, 2, 23, 54},
                                    {76, 21, 67,98,77}};

    int[] arrayNumber = {78, 23, 672,  2, 41};
        int number =  41;
        int target = 44;
        System.out.println("->  "+linearSearchL(arrayNumber,  number));

        String name = "boneshaker";
        char git = 'e';

        System.out.println(" -> "+stringLinearSearch(name, git));
        System.out.println("min -> "+findMiniMumNumber(arrayNumber));
        System.out.println("max -> "+findMaxNumber(arrayNumber));
        System.out.println("2D->  "+   (Arrays.toString(array2DSearch(arrayNumberZ, target))));

    }

}
