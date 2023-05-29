package vTest;

public class AirCondition {
    private static int temperature;

    public static void setTemperature(int temperature) {
        if (temperature >= 30) {
            temperature = 30;
        }
        AirCondition.temperature = temperature;
    }

    public static int getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        setTemperature(35);
        System.out.println("this is temprature ()->  "+getTemperature());
    }
}
