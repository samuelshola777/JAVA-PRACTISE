package leetCode;

public class HighestSumArray {
    public static void main(String[] args) {

        int[] array = {7, 9, 3, 2, 9, 71};
        int sum = array[0] + array[1];
        int range = 2;
        int count = 0;


        for (int i = 0; i < array.length - 2; i++) {
            int count1 = i;
            if (count < 3) {
                System.out.print(" " + array[count]);
                count++;
            }
           count1++;
            }
        }



}
