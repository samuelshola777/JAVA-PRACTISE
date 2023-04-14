package task;

import java.util.ArrayList;
import java.util.List;

public class SecoondLargest {
    public static void main(String[] args) {

        int[] numbers = {4, 78, 4, 2, 90, 4};
        int largest = 0;
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersList.add(numbers[i]);
        }
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) > largest) {
                numbersList.remove(i);
            }
                System.out.print(numbersList.get(i) + " ");
            }

        }

}