package chapter3;

import java.util.Scanner;

public class ModifyHealthReport3rdClass {



        ModifyHealthCareReport healthreport = new ModifyHealthCareReport("unknown",
                "unknwn",
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
        Scanner string = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        public void displayHealthReport () {

            System.out.println("please enter your information :\n\n" +
                    "please enter your first name and press enter and enter last name ");
            String firstName = string.nextLine();
            String lastName = string.nextLine();
            healthreport.setFirstName(firstName);
            healthreport.setLastName(lastName);

            System.out.println("please enter your gender : ");
            String gender = string.nextLine();

            System.out.println("please enter date, month, and year ");
            int currentDate = input.nextInt();
            int currentMonth = input.nextInt();
            int currentYear = input.nextInt();
            healthreport.setBirthDate(currentDate);
            healthreport.setCurrentMonth(currentMonth);
            healthreport.setCurrentYear(currentYear);

            System.out.println("please enter date of birth,  month of birth , year of birth  ");
            int birthDate = input.nextInt();
            int birthMonth = input.nextInt();
            int birthYear = input.nextInt();
            healthreport.setBirthDate(birthDate);
            healthreport.setBirthMonth(birthMonth);
            healthreport.setBirthYear(birthYear);

            System.out.println("please enter height and weight ");
            double height = input.nextDouble();
            double weight = input.nextDouble();


            System.out.println("first name : " + healthreport.getFirstName() + "\n" +
                    "last name : " + healthreport.getLastName());

            System.out.println("you are a " + healthreport.getGender());

            System.out.println("you are " + healthreport.getAge() + " years old ");

            System.out.println("your maximum heart rate is : " + healthreport.getMaximumHeartRate());
            System.out.println();
            healthreport.getTargetHeartRate();
            System.out.println("<<------------------------------------------------------------->>");
            System.out.println("your BMI is " + healthreport.getBMI());
            System.out.println();
            System.out.println("<<------------------------------------------------------------->>");
            System.out.println("your height is  : " + healthreport.getHeight());
            System.out.println();
            System.out.println("your weight is : " + healthreport.getWeight());

        }

    }
