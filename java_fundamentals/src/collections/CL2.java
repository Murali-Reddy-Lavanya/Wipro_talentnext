package collections;
import java.util.ArrayList;

public class CL2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Add 10 different words
        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("date");
        al.add("elderberry");
        al.add("fig");
        al.add("grape");
        al.add("honeydew");
        al.add("kiwi");
        al.add("lemon");

        System.out.println("Words in Reverse Order:");
        al.forEach(word -> System.out.println(new StringBuilder(word).reverse().toString()));
    }
}

