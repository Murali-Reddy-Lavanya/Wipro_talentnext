package abstraction;
public class AbsQ10 {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new ArrayIndexOutOfBoundsException("Exactly 5 integers required.");
            }

            int[] numbers = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            int average = sum / numbers.length;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e);
        }
    }
}


