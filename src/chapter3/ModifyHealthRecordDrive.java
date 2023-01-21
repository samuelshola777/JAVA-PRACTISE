package chapter3;

import java.util.Scanner;

public class ModifyHealthRecordDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ModifyHealthCareReport healthReprt = new ModifyHealthCareReport("unknown",
                "unknown",
                "unknown",
                00,
                00,
                00,
                0.0,
                0.0,
                00,
                00,
                00,
                00);
//
//        System.out.println("enter birth year ");
//        int birthYear = input.nextInt();
//        healthReprt.setBirthYear(birthYear);
//
//        System.out.println("enter current year ");
//        int currentYear = input.nextInt();
//        healthReprt.setCurrentYear(currentYear);
//
//        System.out.println("your old "+healthReprt.getAge());
//
//        System.out.println("maximum heart rate "+healthReprt.getMaximumHeartRate());
//

       ModifyHealthReport3rdClass boneshaker = new ModifyHealthReport3rdClass();


       boneshaker.displayHealthReport();
     //   healthReprt.getTargetHeartRate();
//        healthRoport.displayHealthReport();

  }



}
