package DataStuctureAndAlgorithm;

public class ArrayEvenLength {

    public static int evenLength(int[] array){
        int number = 0;
        for (int i = 0; i < array.length; i++) {
       String value  =  String.valueOf(array[i] );
          if (value.length() % 2 == 0) {
              number++;
          }
        }
       return number;
    }

    public static void main(String[] args) {

        int [] number = {456, 9876, 90000, 23, 143, 123, 908421};

        System.out.println(evenLength(number));


    }

}
