package collections;
import java.time.Year;

public class CDT4 {
    public static void main(String[] args) {
        // Get the current year
        int currentYear = Year.now().getValue();

        // Check if it’s a leap year
        if (Year.isLeap(currentYear)) {
            System.out.println(currentYear + " is a leap year.");
        } else {
            System.out.println(currentYear + " is not a leap year.");
        }
    }
}

