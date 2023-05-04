package Chapter8;

import java.time.LocalDateTime;

public class FancyTime {

    private int hour, minute,second;
    private LocalDateTime time = LocalDateTime.now().plusSeconds(1);
    public FancyTime(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    displayTime1(hour, minute, second);
    }
    public FancyTime(int hour, int minute){
        validate(hour, minute);
        this.hour = hour;
        this.minute = minute;
    }

    public FancyTime(int hour){
        validate(hour);
        this.hour = hour;
    }

    public FancyTime() {
    }


    public void validate(int hour, int minute, int second) {
    if (hour > 23 || hour < 0) {
        throw new IllegalArgumentException("Invalid hour input : " + hour);
    }
    if (minute > 59 || minute < 0) {
        throw new IllegalArgumentException("Invalid minute input : " + minute);
    }
    if (second > 59 || second < 0) {
        throw new IllegalArgumentException("Invalid second input : " + second);
    }
}

public void validate(int hour, int minute){
        if ( hour > 23 || hour < 0){
            throw new IllegalArgumentException("Invalid hour input : " + hour);
        }
        if ( minute > 59 || minute < 0){
            throw new IllegalArgumentException("Invalid minute input : " +minute);
        }

        }

        public String displayTime1(int hour, int minute, int second){
        validate(hour, minute, second);
        return String.format("""
            hour: %d, minute: %d, second: %d '%s'
                """, (hour > 12 ? hour % 12 : hour),minute,second,(hour > 12 ? ": PM" : ": AM"));
        }
        public String displayTime3(int hour, int minute, int second){
        validate(hour, minute, second);
        return String.format("""
            hour: %d, minute: %d, second: %d
                """,hour,minute, second);
        }
        public String displayTime2(int hour, int minute){
        validate(hour, minute);
        return String.format("""
            hour: %d, minute: %d
                """,hour, minute);
        }
    public String toString() {
        return String.format("""
        hh : %d, min: %d, sec: %d, max: %s
                """,hour > 12 ? hour % 12 : hour , minute, second, hour > 12 ? "pm": "am");
    }
    

    public void validate(int hour) {
        if (hour > 23 || hour < 0) {
            throw new IllegalArgumentException("Invalid hour input : " + hour);
        }
    }

    public static void main(String[] args) {

        FancyTime time = new FancyTime(3,45,56);

//        System.out.println(time.displayTime1(15, 45, 34));

        System.out.println(time);

    }
}
