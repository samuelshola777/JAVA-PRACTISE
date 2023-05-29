package task.chapter5;

import java.util.HashSet;
import java.util.Set;

public class DublicateInSet {
    public static void main(String[] args) {

        int[] numbers =    {6, 5 , 1, 2, 3,44, 3, 1, 2, 4, 2};
        Set<Integer> setNumber = new HashSet<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            setNumber.add(numbers[i]);
        }
        System.out.print("  "+setNumber);
    }
}
