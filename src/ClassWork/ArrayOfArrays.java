package ClassWork;

public class ArrayOfArrays {
    public static void main(String[] args) {

        int [] array = new int [5];
        int [] array1 = new int [4];
        int [] array2 = new int [4];
        int [] array3 = new int [4];
        int [] array4 = new int [4];

        int [][] multipleArray = {array, array1, array2, array3, array4};


        int [][] samuelShola = new int[3][];

        int[] shola = new int[5];

        multipleArray[0] = shola;

    }
}
