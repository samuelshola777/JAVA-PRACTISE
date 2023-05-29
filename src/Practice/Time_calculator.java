package Practice;

public class Time_calculator {

    private int seconds;
    private int minutes;
    private int hours;
    private int days;
    private int weeks;
    private int months;
    private int years;


    public void setSeconds(int seconds){

        if (seconds > 0 && seconds < 60 ){
            this.seconds = seconds;
        }
    }
    public void setMinutes(int minutes){

        if (minutes > 0 && minutes < 3600 ){
            this.minutes = minutes;
        }
    }

    public void setHours(int hours) {
        if (hours > 0 && hours < 86_400) {
            this.hours = hours;
        }
    }
}
