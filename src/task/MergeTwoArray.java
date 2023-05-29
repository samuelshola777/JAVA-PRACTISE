package task;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArray {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
//        List<Integer> number1 = new ArrayList<>();
        int sort = 0;
        int[] array1 = {
                1, 3, 5, 7
        };
        int[] array2 = {2, 4, 6, 8};
int[] array3 = new int[number.size()];
for (int i = 0; i < array1.length ; i++) {
            number.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            number.add(array2[i]);


        }
        for (int i = 0; i < number.size(); i++) {
         array3[i] = number.get(i);
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+" ");
        }
//        for (int i = 0; i < number.size(); i++) {
//            for (int j = 0; j < i ; j++) {
//                if (number.get(i) > number.get(j)) {
//                sort = number.get(i);
//                number.add(number.get(j));
//                number.add(sort);
//                }
//            }
//        }
//        for (int i = 0; i < number.size(); i++) {
//            System.out.print(number.get(i) + " ");
//        }
    }
}
