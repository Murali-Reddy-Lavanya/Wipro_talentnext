package collections;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;

public class CG3 {
    public static void main(String[] args) {
        // Create a TreeSet to store String objects
        TreeSet<String> countries = new TreeSet<>();

        // Add elements to TreeSet
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");
        countries.add("Canada");

        // a) Reverse the elements using descendingSet()
        NavigableSet<String> reversed = countries.descendingSet();
        System.out.println("Reversed TreeSet:");
        for (String country : reversed) {
            System.out.println(country);
        }

        // b) Iterate elements using Iterator
        System.out.println("\nTreeSet using Iterator:");
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if a particular element exists
        String searchCountry = "India";
        if (countries.contains(searchCountry)) {
            System.out.println("\n" + searchCountry + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + searchCountry + " does not exist in the TreeSet.");
        }
    }
}

