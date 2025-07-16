package abstraction;

//Step 1: Custom Exception Class
class InvalidCountryException extends Exception {
 // Step 2: Overloaded constructors
 public InvalidCountryException() {
     super("User Outside India cannot be registered");
 }

 public InvalidCountryException(String message) {
     super(message);
 }
}

//Step 3: Main class with registerUser method
public class AbsQ12 {

 public void registerUser(String username, String userCountry) throws InvalidCountryException {
     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException();
     } else {
         System.out.println("User registration done successfully");
     }
 }

 public static void main(String[] args) {
     AbsQ12 userReg = new AbsQ12();

     // Example Input
     String username = "Mickey";
     String country = "US";

     try {
         userReg.registerUser(username, country);
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }
 }
}

