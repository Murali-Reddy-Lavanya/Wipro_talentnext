package java_fundamentals;
import java.util.*;
public class Question21 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = (double) sum / numbers.length;
        // Step 4: Print sum and average
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        sc.close();
    }
}