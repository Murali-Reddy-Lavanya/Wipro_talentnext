package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CFI3 {
    public static void main(String[] args) {
        // Create an ArrayList with 10 words
        List<String> words = new ArrayList<>();
        words.add("level");
        words.add("hello");
        words.add("madam");
        words.add("world");
        words.add("noon");
        words.add("java");
        words.add("racecar");
        words.add("code");
        words.add("radar");
        words.add("apple");

        // Predicate to check if a word is a palindrome
        Predicate<String> isPalindrome = word -> {
            StringBuilder reversed = new StringBuilder(word).reverse();
            return word.equalsIgnoreCase(reversed.toString());
        };

        // Filter and print palindrome words
        System.out.println("Palindrome words:");
        words.stream()
             .filter(isPalindrome)
             .forEach(System.out::println);
    }
}

