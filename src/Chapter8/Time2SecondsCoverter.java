package Chapter8;

import java.util.Scanner;

public class Time2SecondsCoverter {
    public static void main(String[] args) {
        while (true) {
            int minute = 0;
            int seconds = 0;
            int hour = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter number of seconds available");
            int numn = scanner.nextInt();

            if (numn >= 60) {
                minute = numn / 60;
                seconds = numn % 60;
            }
                if (minute > 60){
                  hour = minute / 60;
                  minute = minute % 60;
                    System.out.println("we have " +hour + " hour and " + minute + " minutes");
            }
            System.out.println("we have " + minute + " minute and " + seconds + " seconds");
        }

    }
}
