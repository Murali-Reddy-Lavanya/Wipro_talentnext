package collections;
import java.util.TreeSet;
import java.util.Iterator;

public class CG4 {
    public static void main(String[] args) {
        // Create a TreeSet to store String months
        TreeSet<String> months = new TreeSet<>();

        // Add months to the TreeSet
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print months using Iterator
        System.out.println("Months of the Year (Sorted Order):");
        Iterator<String> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
