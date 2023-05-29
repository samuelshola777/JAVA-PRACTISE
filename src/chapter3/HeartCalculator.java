package chapter3;

public class HeartCalculator {
    private  String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDate;
    private int birthYear;

    public HeartCalculator(String firstName, String lastName, int birthMonth, int birthDate, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDate = birthDate;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getAge(){
        int age = 2022 - birthYear;
        return age;
    }
    public int getMaximumHeartRate(){
        int maximumHeartRate = 220 - getAge();
        return  maximumHeartRate;
    }
    public String getTargetHeartRate(){
        double lowerBoundary = 0.5 * getMaximumHeartRate();
        double upperboundary = 0.85 * getMaximumHeartRate();
        return lowerBoundary + " - " + upperboundary;
    }

}

