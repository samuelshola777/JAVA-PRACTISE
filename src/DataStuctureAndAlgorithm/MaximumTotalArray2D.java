package DataStuctureAndAlgorithm;

public class MaximumTotalArray2D {

    static int maximumTotalArray2D(int [][] array){


        int [] arrayReceivers = new int[array.length];
        int num = arrayReceivers[0];

        for (int i = 0; i < array.length; i++) {
            int total = 0;
            for (int j = 0; j < array[i].length ; j++) {
               total += array[i][j];
            }
            arrayReceivers[i] = total;

        }

        for (int i = 0; i < arrayReceivers.length; i++) {

            if (arrayReceivers[i] > num){
                num = arrayReceivers[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int[][] justArray = {{0,1,2,3}, {90,5, 2,1,1,1}, {90,5,6}, {90,5,10}};

        System.out.println("==>  "+maximumTotalArray2D(justArray));
    }

}
