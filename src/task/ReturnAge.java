package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReturnAge {
//    public static LocalDate ge = ;
    private String date;
    private String month;
    private String year;
//    public int getReturnAge(String birthDate) {
//        String word = "09 12 1996";
//        String[] time = new String[word.length()];
//
//
//        String[] result = word.split("\\s");
//        for (int x = 0; x < result.length; x++) {
//            time[x] = result[x];
//String data = time[0];
//String month = time[1];
//String year = time[2];
//
//        }
//        DateTimeFormatter.ofLocalizedTime()
//    }

    public static void main(String[] args) {
        String word = "09 12 1996";
        String[] time = new String[word.length()];


        String[] result = word.split("\\s");
        for (int x = 0; x < result.length; x++) {
            time[x] = result[x];
            System.out.println(time[x]);


            }

        }
    }