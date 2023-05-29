package chapter3;

import java.util.Scanner;

public class HeartRateCalculatorTest {
    public static void main(String[] args) {

        HeartCalculator heart = new HeartCalculator(
                "samuel",
                "shola",
                06,
                14,
                1996);
        System.out.println("person's age :"+heart.getAge());
        System.out.println("person's heart rate"+heart.getMaximumHeartRate());
        System.out.println("person's target heart rate "+heart.getTargetHeartRate());




    }
}
