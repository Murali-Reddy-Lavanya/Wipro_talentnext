package collections;
import java.util.LinkedList;
import java.util.Iterator;

public class CQ5 {
    // Method to print all elements using Iterator
    public static void printAll(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("Months of the Year:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        // Create a LinkedList to store only Strings (months)
        LinkedList<String> months = new LinkedList<>();

        // Add all months
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

        // Print all months using Iterator
        printAll(months);
    }
}

