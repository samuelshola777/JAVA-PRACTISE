package JavaSpecialLessons;

import java.time.LocalDate;

public class LocalDateTimez {
    public static void main(String[] args) {



                // Example: event occurs on the 15th day of every month starting from Jan 15, 2022
                int dayOfMonth = 15;
                LocalDate eventDate = LocalDate.of(2022, 1, dayOfMonth);

                // Get the date of when the event will occur the following month
                LocalDate nextMonthDate = eventDate.plusMonths(1);

                // Output the date of the next event occurrence
                System.out.println("The next event will occur on: " + nextMonthDate);
            }
        }



