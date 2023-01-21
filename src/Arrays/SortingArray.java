package Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] array = {46, 57, 90, 23 ,80, 34};

        int arrangng = 0;

        for (int counter = 0 ; counter < array.length; counter++){

            for (int counter2 = counter;  counter2 < array.length ; counter2++){
                if (array[counter]< array[counter2]){
                    arrangng = array[counter];
                    array[counter] = array[counter2];
                    array[counter2] = arrangng;

                }
            }

        }
        for (int counter = 0 ; counter < array.length ; counter++){
            System.out.println(array[counter]);

        }
    }
}
