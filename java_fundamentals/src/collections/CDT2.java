package collections;
import java.time.*;

public class CDT2 {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Get the first day of the next month
        LocalDate firstOfNextMonth = today.plusMonths(1).withDayOfMonth(1);

        // Find the first Sunday of the next month
        LocalDate firstSunday = firstOfNextMonth;
        while (firstSunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
            firstSunday = firstSunday.plusDays(1);
        }

        // Add 7 days to get the second Sunday
        LocalDate secondSunday = firstSunday.plusDays(7);

        // Display the result
        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}
