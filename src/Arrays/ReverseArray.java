package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[]array = {90,12, 16, 32, 14,500};
        int[]array2 = new int[array.length];


            for (int j = array2.length-1; j >= 0; j--) {
               array2[j] = array[j];
                System.out.print(array2[j]+" ");
            }
        }

    }

