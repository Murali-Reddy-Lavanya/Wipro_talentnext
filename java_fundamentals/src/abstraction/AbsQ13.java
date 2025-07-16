package abstraction;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AbsQ13 {
    public static void main(String[] args) {
        try {
            // Check if exactly 2 arguments are passed
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly 2 arguments: <name> <age>");
            }

            String name = args[0];
            int age;

            // Try parsing the age argument
            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Age must be a valid integer.");
            }

            // Validate age range
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be between 18 and 59.");
            }

            // Success
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Person details are valid!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Program exited due to invalid input.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Program exited due to invalid input.");
        }
    }
}

