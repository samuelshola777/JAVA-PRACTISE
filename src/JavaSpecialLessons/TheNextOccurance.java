package JavaSpecialLessons;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TheNextOccurance {

        public static LocalDate getNextMonthlyEventDate(LocalDate eventDate) {
            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // If the event date is in the past, move it to the next month
            if (currentDate.isAfter(eventDate)) {
                eventDate = eventDate.plusMonths(1);
            }

            // Calculate the number of months between the current date and the event date
            long monthsBetween = ChronoUnit.MONTHS.between(currentDate.withDayOfMonth(1), eventDate.withDayOfMonth(1));

            // Add the number of months to the event date to get the next event date
            LocalDate nextEventDate = eventDate.plusMonths(monthsBetween);

            return nextEventDate;
        }
    }


