package Chapter8;

public class Time1 {
private int hour;
private int minute;
private int seconds;

public void setTime(int hour, int minute, int seconds){
    hourChecking();
    this.hour = hour;
    minuteChecking();
    this.minute = minute;
   secondsChecking();
   this.seconds = seconds;
}

public void hourChecking() {
    if (hour >= 24 || hour < 0) {
        throw new IllegalArgumentException("hour was out of range");

    }
}
public void minuteChecking() {
    if (minute >= 59 || minute < 0) {
        throw new IllegalArgumentException("minute was out of range");

    }
}
public void secondsChecking() {
        if (seconds >= 59 || seconds < 0) {
            throw new IllegalArgumentException("seconds was out of range");
        }
        }

        public String toUniversalString(){
    return String.format("%02d:%02d:%02d ", hour, minute, seconds);

        }
        public String toString(){
    return String.format("%d: %02d: %02d %s",
            ((hour == 0 || hour == 12) ? 12 : hour % 12),
            minute, seconds, (hour < 12 ? "AM " : "PM") );
        }

}

