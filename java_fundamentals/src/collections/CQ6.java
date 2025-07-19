package collections;
import java.util.Vector;
import java.util.Iterator;

public class CQ6 {
    // Method to print all elements using Iterator
    public static void printAll(Vector<String> months) {
        Iterator<String> iterator = months.iterator();
        System.out.println("Months of the Year:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        // Create a Vector to store Strings (months)
        Vector<String> months = new Vector<>();

        // Add all months to the vector
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

        // Print all months
        printAll(months);
    }
}

