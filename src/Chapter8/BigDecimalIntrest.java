package Chapter8;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BigDecimalIntrest {
    public static void main(String[] args) {
        BigDecimal principle = BigDecimal.valueOf(1000.0);
        BigDecimal reta = BigDecimal.valueOf(0.05);
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 0; year < 10; year++) {

            BigDecimal amount = principle.multiply(reta.add(BigDecimal.ONE).pow(year));
    System.out.printf("%4d%20s%n", year,
            NumberFormat.getCurrencyInstance().format(amount));
    }
}
}