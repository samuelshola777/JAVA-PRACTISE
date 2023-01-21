package ClassWork;

public class ReverseArray {

    public static void reverseArray() {

        int[] array = {10, 9, 8, 7, 4, 6, 3, 3, 2, 1};

        for (int time = array.length - 1; time >= 0; time--) {
            System.out.println(array[time]);

        }

    }


    public static void main(String[] args) {

        reverseArray();
    }

}
