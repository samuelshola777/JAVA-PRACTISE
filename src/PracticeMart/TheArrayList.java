package PracticeMart;

import java.util.ArrayList;

public class TheArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> samuel = new ArrayList<>();
        samuel.add(4);
        samuel.add(8);
        samuel.add(3);
        samuel.add(90);
        samuel.add(9,56);


        int max = samuel.get(0);
        int min = samuel.get(0);
        for (int i = 0; i < samuel.size(); i++) {

            //  System.out.println(samuel.get(i));
        if (samuel.get(i) > max){
            max = samuel.get(i);
        }
        if (samuel.get(i) < min){
            min = samuel.get(i);
        }


        }
        System.out.println(max);
        System.out.println(min);
        int receivingValue = samuel.get(0);

        for (int i = 0; i < samuel.size(); i++) {

            for (int j = 0; j < samuel.size(); j++) {

                if (samuel.get(i) < receivingValue) {

                

                }
                System.out.println(samuel.get(i));
            }

        }
    }
}