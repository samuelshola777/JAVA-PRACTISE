package task.chapter5;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] number = {3, 2, 5, 7, 7, 9, 9, 4, 10};
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
                if (!numbers.contains(number[i])){
                    numbers.add(number[i]);
            }
            
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print("  "+numbers.get(i));
        }
        
    }

}
