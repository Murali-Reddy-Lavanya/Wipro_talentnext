package java_fundamentals;
import java.util.*;
public class Question27 {
	public static void main(String[] args) {
        int[] numbers = {12, 34, 12, 45, 67, 89};
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}

