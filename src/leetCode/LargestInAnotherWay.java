package leetCode;

public class LargestInAnotherWay {

    public static void main(String[] args) {
        int[] array = {5, 900, 8, 900, 1000, 3000, 1};
//        int largest = array[0];
        int largest = 0;
        int secondLargest = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }


        }
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println(" second()->  " + secondLargest);
        System.out.println("first()->  " + largest);

    }
}