package Chapter8;

public class NewTime1 {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        if (hour >= 24 || hour < 0)
            throw new IllegalArgumentException("Invalid hour input : " + hour);
        if (minute >= 59 || minute < 0)
            throw new IllegalArgumentException("Invalid minute input : " + minute);
        if (second >= 59 || second < 0) throw new IllegalArgumentException("Invalid second input : " + second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
    public String universalTime() {
    return String.format("""
            hour: %d minutes: %d seconds: %d
            """);
    }
}
