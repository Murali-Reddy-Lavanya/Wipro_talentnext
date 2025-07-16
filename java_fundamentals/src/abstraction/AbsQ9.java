package abstraction;
import java.util.Scanner;

public class AbsQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input array size
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(scanner.nextLine());

            int[] arr = new int[size];

            // Input array elements
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(scanner.nextLine());
            }

            // Input index to access
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(scanner.nextLine());

            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } 
        catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }

        scanner.close();
    }
}

