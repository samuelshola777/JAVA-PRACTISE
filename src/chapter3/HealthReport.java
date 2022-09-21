package chapter3;

public class HealthReport {

    private String name;

    private String gender;

    private int age;

    private  double height;

    private  double weight;

    private double heartRate;

    private double BMI;

    public HealthReport(String name, String gender, int age, double height, double weight, double heartRate, double BMI ){

this.name = name;

this.gender = gender;

this.age = age;

this.height = height;

this.weight = weight;

this.BMI = BMI;

this.heartRate = heartRate;

    }




    public void setName(String firstName, String lastName ){
        this.name = name;
    }
    public void setGender(String male, String female){
        this.gender = gender;
    }
    public void setAge(int date, int month, int year ){
        this.age = age;
    }
public void setHight( double height){
        this.height = height;
}
public void setWeight(double weight){
        this.weight = weight;
}
public void setBMI(double BMI){
        this.BMI = BMI;
}
public void setHeartRate(double heartRate){
        this.heartRate = heartRate;
}
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public double getBMI(){
        return BMI;
    }
    public double getHeartRate(){
        return heartRate;
    }


}
