package Chapter4;

public class SlidingWindows {
    public static void main(String[] args) {

        int[] array = {4, 5, 2, 6, 7, 9, 3};
        int count = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
         if (count <= 3) {
             temp = array[count];
             count++;
         }

         if (count == 3) {
           count = 0;
         }
//         count++;
            System.out.print(temp+" ");
        }
    }
}