package collections;
import java.util.ArrayList;
import java.util.Random;

public class CL1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();

        // Add 25 random numbers between 1 and 100
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1);
        }

        System.out.println("Original List:");
        System.out.println(al);

        System.out.println("\nPrime Numbers:");
        al.forEach(n -> {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        });
    }

    // Method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

