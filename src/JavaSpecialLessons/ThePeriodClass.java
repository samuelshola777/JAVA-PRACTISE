package JavaSpecialLessons;

import java.time.LocalDate;
import java.time.Period;

public class ThePeriodClass {
    public static void main(String[] args) {


        Period period = Period.of(1, 6, 0);
        // TODO: 4/20/2023   // represents a period of 1 year and 6 months
        LocalDate date = LocalDate.now();
        // TODO: 4/20/2023   // get the current date
        LocalDate newDate = date.plus(period);
        // TODO: 4/20/2023  // add the period to the current date

        System.out.println(newDate);

// TODO: 4/20/2023  //        In Java, the Period class is used to represent a
//                period of time between two dates
//                in terms of years, months, and days. Some
//        of the available methods in the Period class are:
//
// TODO: 4/20/2023  //        ofYears(int years) - Creates a Period
//        representing a number of years.
//                ofMonths(int months) - Creates a Period
//        representing a number of months.
//        ofDays(int days) - Creates a Period representing a number of days.
//        between(LocalDate startDateInclusive, LocalDate endDateExclusive)
//                - Obtains a Period representing the time between two dates.
//        getYears() - Returns the number of years in the period.
//                getMonths() - Returns the number of months in the period.
//                getDays() - Returns the number of days in the period.
//                plus(Period other) - Adds the specified Period to this one.
//                minus(Period other) - Subtracts the specified Period from this one.
//                These are just a few examples of the methods available in the Period class.
//        There are several other methods that can be used to manipulate or extract information from Period objects.

    }
}
