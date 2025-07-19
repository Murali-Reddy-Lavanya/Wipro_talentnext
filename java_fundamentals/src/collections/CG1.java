package collections;
import java.util.HashSet;
import java.util.Iterator;

public class CG1 {
    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        Iterator<String> iterator = H1.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CG1 cs = new CG1();
        cs.saveCountryNames("India");
        cs.saveCountryNames("Japan");
        cs.saveCountryNames("USA");
        cs.saveCountryNames("Germany");

        System.out.println("HashSet of countries: " + cs.H1);
        System.out.println("Get 'India': " + cs.getCountry("India"));
        System.out.println("Get 'Canada': " + cs.getCountry("Canada"));
    }
}
