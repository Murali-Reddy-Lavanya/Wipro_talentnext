package collections;
import java.time.LocalTime;

public class CDT6 {
    public static void main(String[] args) {
        // Get the current time
        LocalTime now = LocalTime.now();

        // Subtract 5 hours and 30 minutes
        LocalTime beforeTime = now.minusHours(5).minusMinutes(30);

        // Display the times
        System.out.println("Current Time                : " + now);
        System.out.println("Time Before 5h 30m          : " + beforeTime);
    }
}

