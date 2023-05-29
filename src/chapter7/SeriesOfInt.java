package chapter7;

import Chapter4.MilePerGarlon2;

public class SeriesOfInt {
    public static double weirdArray(int... num){
//        int [] series = new  int[num];
//        int average = 0;
//        for(int i = 0; i < num ; i++){
//            series[i] = MilePerGarlon2.tryAndCatch();
//
//
//        }
//        for (int i = 0; i < series.length; i++) {
//            System.out.println(series[i]);
//            average  = series[i] + average;
//        }
//        average = average / num;
//
//        System.out.println(" the average is ***  "+average);

        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        double average = (double) total / num.length;
        return average;
    }

    public static void main(String[] args) {
        double averageOf = weirdArray(10, 20, 30, 40,  50, 32, 56, 99);
        System.out.println("The average of the numbers is " + averageOf);




    }
}
