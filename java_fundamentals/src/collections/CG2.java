package collections;
import java.util.HashSet;
import java.util.Iterator;

public class CG2 {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<>();

        // Add employee names
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("David");
        employeeNames.add("Eva");

        // Use Iterator to retrieve and print names one by one
        Iterator<String> iterator = employeeNames.iterator();
        System.out.println("Employee Names:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
