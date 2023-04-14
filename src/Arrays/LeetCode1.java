package Arrays;

public class LeetCode1 {

    public static void main(String[] args) {

        char [] number = {'q','r','#','#','d','e','#','h'};
        int j = 0;
        for (int i = 0; i < number.length ; i++) {
            if (number[i] == '#' ) {
                j = i-1;
//                System.out.print(j+" ");
number[j] = '*';
}
        }
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            System.out.print(" "+number[i]);
}

    }
    public int[] addArrays(int[] arr1, int[] arr2) {
        // Check if arrays have the same length
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        // Create a new array to hold the result
        int[] result = new int[arr1.length];

        // Iterate through both arrays and add the corresponding elements
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }
}
