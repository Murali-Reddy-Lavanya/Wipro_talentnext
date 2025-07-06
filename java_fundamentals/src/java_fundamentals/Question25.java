package java_fundamentals;
import java.util.*;
public class Question25{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int[] numbers = {12, 5, 7, 3, 25, 9, 31, 2};
        Arrays.sort(numbers); 
        int smallest1 = numbers[0];
        int smallest2 = numbers[1];
        int largest1 = numbers[numbers.length - 1];
        int largest2 = numbers[numbers.length - 2];
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
        sc.close();
    }
}
