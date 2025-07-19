package collections;
import java.util.*;
import java.util.function.Consumer;

public class CFI7 {
    public static void main(String[] args) {
        // Create an ArrayList with 10 numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 10, 15, 18, 21, 24);

        // Consumer to print each number and its type (odd or even)
        Consumer<Integer> checkOddEven = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " even");
            } else {
                System.out.println(n + " odd");
            }
        };

        // Apply the consumer to each element
        numbers.forEach(checkOddEven);
    }
}

