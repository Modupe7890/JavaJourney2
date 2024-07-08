package Chapter8;

import java.math.BigDecimal;
import java.text.NumberFormat;

// Compound-interest calculations with BigDecimal.
public class Interest {
    public static void main(String[] args) {
        // initial principal amount before interest
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for(int year =1; year <= 10; year++){
            // Calculate the amount for specific year
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE));

            //Display the year and the month
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
