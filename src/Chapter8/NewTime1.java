package Chapter8;

import java.util.Scanner;

public class NewTime1 {
    Scanner scanner = new Scanner(System.in);
    private int hour;
    private int minute;
    private int second;

 

    public void setTime(int hour, int minute, int second) {
        if (hour >= 24 || hour < 0)
            throw new IllegalArgumentException("Invalid hour input : " + hour);
        if (minute > 59 || minute < 0)
            throw new IllegalArgumentException("Invalid minute input : " + minute);
        if (second > 59 || second < 0) throw new IllegalArgumentException("Invalid second input : " + second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String universalTime() {
    return String.format("""
            hour: %d minutes: %d seconds: %d
            """,hour, minute, second);
    }
    public String toString(){
        return String.format("%d: %02d: %02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM " : "PM") );
    }



public void collectInput(NewTime1 time){

    System.out.println("enter hour ");
    int hour = scanner.nextInt();

    System.out.println("enter minute ");
    int minute = scanner.nextInt();

    System.out.println("enter second ");
    int second = scanner.nextInt();

    time.setTime(hour, minute, second);

    System.out.println(universalTime());
    System.out.println(time);
}
    public static void main(String[] args) {

        NewTime1 time = new NewTime1();




                        try {
                         time.collectInput(time);
                        }catch (IllegalArgumentException e) {
                        System.out.println("please enter a valid time");
                        try {
                            time.collectInput(time);
                        }catch (IllegalArgumentException r){
                            System.out.println("please enter a valid time");
                            time.collectInput(time);
                        }

                        }


    }
}
