package collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class Cm1 {
    // Step 1: Instance variable
    HashMap<String, String> M1 = new HashMap<>();

    // Step 1: Save country and capital to the map
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Step 2: Get capital based on country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Step 3: Get country based on capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Step 4: Create a new map with capital as key and country as value
    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // Step 5: Create an ArrayList of country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method for testing
    public static void main(String[] args) {
        Cm1 map = new Cm1();

        // Add entries
        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");
        map.saveCountryCapital("USA", "Washington DC");
        map.saveCountryCapital("France", "Paris");

        // Test getCapital
        System.out.println("Capital of India: " + map.getCapital("India"));

        // Test getCountry
        System.out.println("Country with capital 'Tokyo': " + map.getCountry("Tokyo"));

        // Test reverseMap
        HashMap<String, String> reversed = map.reverseMap();
        System.out.println("Reversed Map (Capital -> Country): " + reversed);

        // Test getAllCountries
        ArrayList<String> countries = map.getAllCountries();
        System.out.println("All countries: " + countries);
    }
}
