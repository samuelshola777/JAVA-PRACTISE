package chapter7;

import Chapter4.MilePerGarlon2;

public class increaseLoopByTen {

    public static void main(String[] args) {
        int [] array = new int[10];
        array[0] = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length;) {
            int deola = MilePerGarlon2.tryAndCatch();

            if (deola > 10 && deola < 100 ){
                array[i] = deola;
                i++;
            }
            else {
                System.out.println("Invalid number.");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]){
                    array[j] = -1;
                }
            }
        }

        for(int number : array) {
            System.out.println(number != -1 ? number : "miss");
        }
    }
}
