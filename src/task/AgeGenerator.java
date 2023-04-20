package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AgeGenerator {
    public static void main(String[] args) {

        int currentYear = LocalDateTime.now().getYear();
        System.out.println(currentYear);
        LocalDate birthDate = LocalDate.of(1990, 5, 20);
        LocalDate currentDate = LocalDate.now();
        int age = (int) ChronoUnit.YEARS.between(birthDate, currentDate);

    }
}
