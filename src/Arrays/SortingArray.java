package Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] array = {46, 57, 90, 23 ,80, 34};

        int arrangng = 0;

        for (int counter1 = 0 ; counter1 < array.length; counter1++){

            for (int counter2 = counter1;  counter2 < array.length ; counter2++){
                if (array[counter1]> array[counter2]){
                    arrangng = array[counter1];
                    array[counter1] = array[counter2];
                    array[counter2] = arrangng;

                }
            }

        }
        for (int counter = 0 ; counter < array.length ; counter++){
            System.out.print(array[counter]+" ");

        }
    }
}
