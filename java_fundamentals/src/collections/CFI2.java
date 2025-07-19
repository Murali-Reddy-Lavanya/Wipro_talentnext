package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CFI2 {
    public static void main(String[] args) {
        // Create an ArrayList with 10 numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);

        // Function to calculate the sum of elements
        Function<List<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };

        // Apply the function and print the result
        int total = sumFunction.apply(numbers);
        System.out.println("Sum of elements: " + total);
    }
}

