package collections;
import java.time.LocalTime;

public class CDT5 {
    public static void main(String[] args) {
        // Get the current time
        LocalTime now = LocalTime.now();

        // Add 25 minutes to the current time
        LocalTime after25Minutes = now.plusMinutes(25);

        // Display the results
        System.out.println("Current Time         : " + now);
        System.out.println("Time After 25 Minutes: " + after25Minutes);
    }
}

