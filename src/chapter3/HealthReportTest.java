package chapter3;

import PracticeMart.UserInformtionStatic;

import java.time.LocalDate;
import java.util.Scanner;

public class HealthReportTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        int year = date.getYear();
DeCar smile = new DeCar("sienna","2015",4.600);
        System.out.println(smile);

        UserInformtionStatic.collectCurrentDate();


HealthReport healthReport = new HealthReport("name", "none", 0, 0.0, 0.0, 0.0 ,0.0);

        System.out.println("name: "+healthReport.getName());
        System.out.println("gender: "+healthReport.getGender());
        System.out.println("age: "+healthReport.getAge());
        System.out.println("heigth: "+healthReport.getHeight());
        System.out.println("weight: "+healthReport.getWeight());
        System.out.println("BMI is: "+healthReport.getBMI());
        System.out.println("current heart is: "+healthReport.getHeartRate());
        System.out.println();
        System.out.println();


        System.out.println("hi. \nwelcome to our health care report service,\n\n***PLEASE CAREFULLY ENTER YOUR DETAIL");
        System.out.println();
        System.out.println();


                      System.out.println("please enter your first name: ");
                      String Name = input.nextLine();

                    System.out.println("please enter your last name: ");
                    String firstName = input.nextLine();
                    System.out.println();

                    healthReport.getGender();

                     System.out.println("please please your gender");
                     String gender = input.nextLine();
                      System.out.println();

                         System.out.println("please enter date of birth");
                           int day = input.nextInt();
                           System.out.println("please enter birth month");
                             int month = input.nextInt();

                        System.out.println("please enter birth year ");
                          int age = input.nextInt();

                           age = year - age;

        healthReport.getHeight();
        System.out.println("please enter height");
       double height = input.nextDouble();

        System.out.println("please enter weight");
        double weight = input.nextDouble();

         double BMI =  weight / height  ;

         double heartRate = 220 - age;

        System.out.println("your first name is " + firstName+"\n");
        System.out.println("you last name is "+ Name+"\n");
        System.out.println("you are a ");
        System.out.println("");


         
    }


}
