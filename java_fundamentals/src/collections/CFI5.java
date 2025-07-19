package collections;
import java.util.*;
import java.util.function.Predicate;

public class CFI5 {
    public static void main(String[] args) {
        // Creating a list of 10 integers
        List<Integer> numbers = Arrays.asList(3, 4, 7, 9, 12, 16, 18, 25, 27, 36);

        // Predicate to check for perfect squares
        Predicate<Integer> isPerfectSquare = n -> {
            if (n < 0) return false;
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        System.out.println("Perfect square numbers from the list:");
        for (int num : numbers) {
            if (isPerfectSquare.test(num)) {
                System.out.println(num);
            }
        }
    }
}

