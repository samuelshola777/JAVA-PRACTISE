package Chapter8;

public class FancyTime {

    private int hour, minute,second;
    public FancyTime(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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


    public void validate(int hour) {
        if (hour > 23 || hour < 0) {
            throw new IllegalArgumentException("Invalid hour input : " + hour);
        }
    }
}
