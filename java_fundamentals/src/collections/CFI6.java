package collections;
import java.util.*;
import java.util.function.Consumer;

public class CFI6 {
    public static void main(String[] args) {
        // Creating an ArrayList with 10 words
        List<String> words = new ArrayList<>(Arrays.asList(
            "hello", "world", "java", "program", "language",
            "stream", "reverse", "lambda", "array", "update"
        ));

        // Consumer to reverse each word and update in the list
        Consumer<List<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String word = list.get(i);
                String reversed = new StringBuilder(word).reverse().toString();
                list.set(i, reversed);
            }
        };

        // Applying the consumer to the words list
        reverseWords.accept(words);

        // Display the updated list
        System.out.println("Reversed words in the ArrayList:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
