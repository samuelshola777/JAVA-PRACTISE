package PracticeMart;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInformtionStatic {

    private static String firstName;
    private static String lastName;
    private static int age;
    private int birthDate;
    private int birthMonth;
    private static int birthYear;
    private static int currentDate;
    private static int currentMonth;
    private static int currentYear;
    private String street;

    public UserInformtionStatic(String firstName, String lastName,
                                int age, int birthDate,
                                int birthMonth, int birthYear,
                                int currentDate, int currentMonth,
                                int currentYear, String street,
                                int houseNumber, String state) {
        UserInformtionStatic.firstName = firstName;
        UserInformtionStatic.lastName = lastName;
        UserInformtionStatic.age = age;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        UserInformtionStatic.birthYear = birthYear;
        UserInformtionStatic.currentDate = currentDate;
        UserInformtionStatic.currentMonth = currentMonth;
        UserInformtionStatic.currentYear = currentYear;
        this.street = street;
        this.houseNumber = houseNumber;
        this.state = state;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        UserInformtionStatic.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        UserInformtionStatic.lastName = lastName;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        age = currentYear - birthYear;
        UserInformtionStatic.age = age;
    }

    public  int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public static int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;

    }

    public static int getCurrentDate() {
        return currentDate;
    }

    public static int setCurrentDate(int currentDate) {
        LocalDate current_date = LocalDate.now();


        UserInformtionStatic.currentDate = currentDate;


        return currentDate;
    }

    public static int getCurrentMonth() {
        return currentMonth;
    }

    public static void setCurrentMonth(int currentMonth) {
        UserInformtionStatic.currentMonth = currentMonth;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

    public static void setCurrentYear(int currentYear) {
        UserInformtionStatic.currentYear = currentYear;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private int houseNumber;
    private String state;
    Scanner input = new Scanner(System.in);


    public static void collectUserName(String firstName, String lastName) {

        UserInformtionStatic.setFirstName(firstName);
        UserInformtionStatic.setLastName(lastName);

    }

    public static void printUserName(String firstName, String lastName) {
        UserInformtionStatic.getFirstName();

        UserInformtionStatic.getLastName();

        System.out.printf("\n%s %s\n", firstName, lastName);


    }

    public static void collectCurrentDate() {

        Scanner number = new Scanner(System.in);

        while (true) {

            System.out.println("please enter current date");

            int currentDate = number.nextInt();
            if (currentDate < 0 || currentDate > 31){
                System.out.println("please your have entered a valid date ");
                continue;
            }
else{
                UserInformtionStatic.setCurrentDate(currentDate);

                break;
            }
        }
while (true) {

    System.out.println("please enter current month ");

    int currentMonth = number.nextInt();
    if (currentMonth > 12 || currentMonth < 0){
        System.out.println("please enter a valid month");
        continue;
    }
else{
        UserInformtionStatic.setCurrentMonth(currentMonth);
        break;
    }
}
while (true) {
            try {

                System.out.println("please  enter current year");
                String currentYear = number.next();
                UserInformtionStatic.setCurrentYear(Integer.parseInt(currentYear));
                // parsing String currentYear to int using Integer.parseInt()
            break;

            } catch (NumberFormatException b) {
                System.out.println("please enter a number not alphabet ");
            }
        }

}
    public static void printCurrentDate() {
        System.out.printf(" \n%d, %d, %d\n", getCurrentDate(), getCurrentMonth(), getCurrentYear());
    }



}