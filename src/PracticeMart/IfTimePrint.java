package PracticeMart;

public class IfTimePrint {
    public static void main(String[] args) {
        int hour = 14;

        if(hour == 0 || hour == 12) {
            hour = 12;
        }

        else {
            hour = hour % 12;
        }

        System.out.println(hour);

    }





}
