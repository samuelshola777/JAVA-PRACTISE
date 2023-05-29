package chapter7;

public class Sum_Array {
    public static void main(String[] args) {

        int [] array = {87, 68, 94, 100, 39, 544, 54};

        int total = 0;

        for (int counter = 0; counter < array.length; counter++){
            total = array[counter] + total;
        }

        System.out.println(total);

    }
}
