package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CSA1 {
    public static void main(String[] args) {
        // Original list with positive, negative, even, and odd numbers
        List<Integer> numbers = Arrays.asList(5, -2, -7, 8, -4, 0, 3, -9, -6, 12);

        // 1 & 2: Filter negative even numbers and store them in new list
        List<Integer> negativeEvenNumbers = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        // 3: Print the filtered ArrayList
        System.out.println("Negative even numbers: " + negativeEvenNumbers);
    }
}
