package java_fundamentals;
import java.util.*;
public class Questio26 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int[] numbers = {5, 2, 9, 1, 7};
        Arrays.sort(numbers);
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
            sc.close();
        }
    }
}
