package collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Cm3 {
    public static void main(String[] args) {
        // Create a Properties object
        Properties stateCapital = new Properties();

        // Add some state-capital pairs
        stateCapital.setProperty("Andhra Pradesh", "Amaravati");
        stateCapital.setProperty("Karnataka", "Bengaluru");
        stateCapital.setProperty("Maharashtra", "Mumbai");
        stateCapital.setProperty("Tamil Nadu", "Chennai");
        stateCapital.setProperty("West Bengal", "Kolkata");

        // Get the entry set from Properties
        Set<Map.Entry<Object, Object>> entries = stateCapital.entrySet();

        // Use an Iterator to loop through all entries
        System.out.println("States and their Capitals:");
        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
