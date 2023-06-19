package DataStuctureAndAlgorithm;

public class LinearSearchSAlgorithm {

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

        int[] arrayNumber = {78, 23, 672,  2, 41};
        int number =  41;
        System.out.println("->  "+linearSearchL(arrayNumber,  number));

        String name = "boneshaker";
        char git = 'e';

        System.out.println(" -> "+stringLinearSearch(name, git));
        System.out.println("min -> "+findMiniMumNumber(arrayNumber));
        System.out.println("max -> "+findMaxNumber(arrayNumber));
    }

}
