package chapter3;

public class ModifyHealthCareReport {

    private String firstName;

    private String lastName;

    private String gender;

    private int birthDate;

    private int birthMonth;

    private int birthYear;

    private double height;

    private  double weight;

    private int age;

    private int currentDate;

    private int currentMonth;

    private int currentYear;

    private int maximumHeartRate;



    public ModifyHealthCareReport(String firstName,
                                  String lastName,
                                  String gender,
                                  int birthDate,
                                  int birthMonth ,
                                  int birthYear,
                                  double height,
                                  double weight,
                                  int age,
                                  int currentDate,
                                  int currentMonth,
                                  int currentYear){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate =  birthDate;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        age = currentYear - birthYear;
        this.age = age;
        this.currentDate = currentDate;
        this.currentMonth = currentMonth;
        this.currentYear = currentYear;


    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public  void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }
    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public void setCurrentDate(int currentDate){
        this.currentDate = currentDate;
    }
    public void setCurrentMonth(int currentMonth){
        this.currentMonth = currentMonth;
    }
    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    }
    public void setHeight( double height){
        this.height = height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    //public void setAge(int age){
    // age = getCurrentYear() - getBirthYear();
     //this.age = age;
    //}
    public void setMaximumHeartRate(int maximumHeartRate){
        maximumHeartRate =  220 - age;
        this.maximumHeartRate = maximumHeartRate;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }

    public int getCurrentDate(){
        return currentDate;
    }

    public int getCurrentMonth(){
        return currentMonth;
    }
    public int getCurrentYear(){
        return currentYear;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public  int getAge(){
        age =   currentYear - birthYear;
        return age;
    }

    public int getBirthDate(){
        return birthDate;
    }

    public  int getBirthMonth(){
        return birthMonth;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public int getMaximumHeartRate() {
        maximumHeartRate =    220 - age;

        return maximumHeartRate;
    }
    public void getTargetHeartRate(){
        double lowerRange = 0.5 * maximumHeartRate;
        double higherRange = 0.85 * maximumHeartRate;
        System.out.printf("low range of target heart rate is %.2f%n",lowerRange);
        System.out.println();
        System.out.printf( "high range of target heart range  %.2f",higherRange);
       // return lowerRange + " - "+ higherRange;
    }
    public double getBMI(){
 double BMI = (height * height)/ weight;
 return BMI;
    }



}
