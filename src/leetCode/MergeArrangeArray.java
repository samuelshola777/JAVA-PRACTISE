package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrangeArray {
    public static void main(String[] args) {

        int[] numb1 = {1, 3, 4, 5};
        int[] numb2 = {2, 6, 7, 8};
        List<Integer> numb3 = new ArrayList<>();

        for (int i = 0; i < numb1.length; i++) {
            numb3.add(numb1[i]);
        }
        for (int i = 0; i < numb2.length; i++) {
            numb3.add(numb2[i]);
        }
        System.out.println(numb3);

        int[] numb4 = new int[numb3.size()];
    }
}