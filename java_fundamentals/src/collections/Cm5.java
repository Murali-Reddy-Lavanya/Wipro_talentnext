package collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cm5 {
    public static void main(String[] args) {
        // Create a TreeMap to store contact names and phone numbers
        TreeMap<String, Long> contacts = new TreeMap<>();

        // Add some contacts
        contacts.put("Alice", 9876543210L);
        contacts.put("Bob", 9123456780L);
        contacts.put("Charlie", 9988776655L);
        contacts.put("Diana", 9876501234L);

        // a) Check if a key (contact name) exists
        String nameToCheck = "Alice";
        if (contacts.containsKey(nameToCheck)) {
            System.out.println("Contact exists: " + nameToCheck);
        } else {
            System.out.println("Contact not found: " + nameToCheck);
        }

        // b) Check if a value (phone number) exists
        Long numberToCheck = 9123456780L;
        if (contacts.containsValue(numberToCheck)) {
            System.out.println("Phone number exists: " + numberToCheck);
        } else {
            System.out.println("Phone number not found: " + numberToCheck);
        }

        // c) Iterate through the TreeMap using Iterator
        System.out.println("\nAll Contacts (Sorted by Name):");
        Set<Map.Entry<String, Long>> entrySet = contacts.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
