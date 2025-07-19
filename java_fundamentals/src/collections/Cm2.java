package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Cm2 {
    public static void main(String[] args) {
        // Create a HashMap that stores String keys and values
        HashMap<String, String> map = new HashMap<>();

        // Add some entries
        map.put("India", "Delhi");
        map.put("USA", "Washington");
        map.put("France", "Paris");
        map.put("Japan", "Tokyo");

        // a) Check if a key exists
        String keyToCheck = "India";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key exists: " + keyToCheck);
        } else {
            System.out.println("Key does not exist: " + keyToCheck);
        }

        // b) Check if a value exists
        String valueToCheck = "Paris";
        if (map.containsValue(valueToCheck)) {
            System.out.println("Value exists: " + valueToCheck);
        } else {
            System.out.println("Value does not exist: " + valueToCheck);
        }

        // c) Iterate using Iterator
        System.out.println("\nIterating through the map:");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
