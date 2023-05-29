package chapter5;

import java.util.ArrayList;
import java.util.List;

public class AddAllOddNumber {
    public static void main(String[] args) {

        int evenNumber = 2;
        int oddNumber = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 99 ; i++) {
            if (i % evenNumber != 0){
                oddNumber += i;
                System.out.println(i);
            }
        }
        System.out.println(oddNumber);
    }
}
