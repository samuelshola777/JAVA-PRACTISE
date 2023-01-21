package ClassWork;

public class FillUpArrayWithForLoop {
    public static void main(String[] args) {
        int [] array = new int [10];

        for (int counter = 0; counter < array.length; counter++){

         array[counter] = counter + 1;

        System.out.printf("%d,",array[counter]);
        }
    }
}
