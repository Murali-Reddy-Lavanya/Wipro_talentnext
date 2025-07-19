package collections;
import java.util.ArrayList;

public class CL3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Add 10 different words
        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("date");
        al.add("fig");
        al.add("grape");
        al.add("honey");
        al.add("kiwi");
        al.add("lemon");
        al.add("mango");

        System.out.println("Words with Odd Length:");
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}

