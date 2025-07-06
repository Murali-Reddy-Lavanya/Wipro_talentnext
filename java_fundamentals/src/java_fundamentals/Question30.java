package java_fundamentals;
import java.util.*;
public class Question30 {
	public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index] = num;
                index++;
            }
        }
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
