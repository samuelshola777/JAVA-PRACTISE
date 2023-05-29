package JavaSpecialLessons;

import java.time.format.DateTimeFormatter;

public class DateTimeFormerZ {
    // TODO: 4/20/2023 In Java, the Period class is used to represent a
    //  period of time between two dates in terms of years, months,
    //  and days. Some of the available methods in the Period class are:
    //
    // TODO: 4/20/2023    //ofYears(int years) - Creates a Period representing
    //  a number of years.
    // TODO: 4/20/2023    //ofMonths(int months) - Creates a Period representing a number
    //  of months.
// TODO: 4/20/2023      //ofDays(int days) - Creates a Period representing a number of
//  days.
    // TODO: 4/20/2023   //between(LocalDate startDateInclusive,
    //  LocalDate endDateExclusive)
    //  - Obtains a Period representing the time between two dates.
    // TODO: 4/20/2023     //getYears() - Returns the number of years in the period.
    // TODO: 4/20/2023    //getMonths() - Returns the number of months in the period.
    // TODO: 4/20/2023     //getDays() - Returns the number of days in the period.
    // TODO: 4/20/2023     //plus(Period other) - Adds the specified Period to this one.
    // TODO: 4/20/2023     //minus(Period other) - Subtracts
    //  the specified Period from this one.
// TODO: 4/20/2023      //These are just a few examples of the
//  methods available in the Period class. There are several other methods that
//  can be used to manipulate or extract information from Period objects.
    public static void main(String[] args) {

        // TODO: 4/20/2023 In this example, the pattern string
        //  "yyyy-MM-dd HH:mm:ss" represents the format of "year-month-day
        //  hour:minute:second". The ofPattern method creates a DateTimeFormatter
        //  object that can be used to parse or format dates and times in this format.
        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(formatter);

    }
}
