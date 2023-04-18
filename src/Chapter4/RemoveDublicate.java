package Chapter4;

import java.util.ArrayList;
import java.util.List;

public class RemoveDublicate {
    public static void main(String[] args) {
        int[] number = {3, 2, 5, 7, 7, 9, 9, 4, 10,90};
        int[] temp = new int[number.length];
        List<Integer> numbers = new ArrayList<>();

//        numbers.add(number[0]);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < i; j++) {
                if ( number[i] != temp[j]) {
                    temp[i] = number[i];
                }

            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print("  "+temp[i]);
        }

    }
}
