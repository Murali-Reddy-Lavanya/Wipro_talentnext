package collections;
import java.util.*;
import java.util.function.Supplier;

public class CFI8 {
    public static void main(String[] args) {
        // Supplier to generate first 10 prime numbers
        Supplier<List<Integer>> primeSupplier = () -> {
            List<Integer> primes = new ArrayList<>();
            int num = 2; // Starting from the first prime number
            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };

        // Get the list of first 10 prime numbers
        List<Integer> primeNumbers = primeSupplier.get();

        // Display the list
        System.out.println("First 10 prime numbers:");
        for (int prime : primeNumbers) {
            System.out.println(prime);
        }
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
