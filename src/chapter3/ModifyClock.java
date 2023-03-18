package chapter3;

public class ModifyClock {
    private  int hour;
    private int minute;
    private  int seconds;

    public ModifyClock(int hour, int minute, int seconds){
        if ( hour >= 23){
            hour = 0;
        }
        this.hour = hour;
        if (minute >= 59 ){
            minute = 0;
        }
        if (seconds >= 59){
            seconds = 0;
        }
    }


    public void  setHour(int hour){
        if ( hour >= 23){
            this.hour = 0;
        }
        this.hour = hour;
    }
    public  void setMinute(int minute){
        if (minute >= 59 ){
        }
            this.minute = 0;
    }
    public void setSeconds(int seconds){
        if (seconds >= 59){
        }
            this.seconds = 0;
    }

    public int getHour(){
        return hour;
    }
    public  int getMinute(){
        return minute;
    }
    public int getSeconds(){
        return seconds;
    }
    public static void displayTime(int hour, int minute, int seconds){

        System.out.printf(" hour: %2d, minute: %3d, seconds: %2d ", hour,minute,seconds);

    }

    @Override
    public String toString() {
        return "ModifyClock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", seconds=" + seconds +
                '}';
    }
}
