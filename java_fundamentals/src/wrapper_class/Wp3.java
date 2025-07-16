package wrapper_class;
import java.util.Scanner;

public class Wp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask for user input
            System.out.print("Enter an integer between 1 and 255: ");
            int number = scanner.nextInt();

            // Check the range
            if (number < 1 || number > 255) {
                System.out.println("Error: Number must be between 1 and 255.");
                return;
            }

            // Convert to binary string
            String binaryString = Integer.toBinaryString(number);

            // Pad with leading zeros to make it 8 characters
            String formattedBinary = String.format("%8s", binaryString).replace(' ', '0');

            // Output
            System.out.println("8-bit Binary Representation: " + formattedBinary);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
