package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectInputArrayList {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int legth = inp.nextInt();

        ArrayList<Integer>bone = new ArrayList<>();

        for (int i = 0; i < legth; i++) {
            System.out.println("please enter element ");
            int element = inp.nextInt();
            for (int j = 0; j < legth; j++) {
                bone.add(i, element);
            }

        }


        for (int i = 0; i < legth; i++) {
            System.out.print(" "+bone.get(i));
        }
    }


}
