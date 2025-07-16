package wrapper_class;

public class Wp2 {
    public static void main(String[] args) {
        try {
            // Check for exactly 1 command-line argument
            if (args.length != 1) {
                System.out.println("Usage: java Test <number>");
                return;
            }

            // Parse the integer input
            int number = Integer.parseInt(args[0]);

            // Print conversions
            System.out.println("Given Number :" + number);
            System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
            System.out.println("Octal equivalent :" + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number).toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer as input.");
        }
    }
}

