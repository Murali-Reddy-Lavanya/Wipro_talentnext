package collections;
//Functional interface with one abstract method
@FunctionalInterface
interface DigitCounter {
 int countDigits(int n);
}

//Class with static method
class NumberUtils {
 public static int digitCount(int n) {
     n = Math.abs(n); // Handle negative numbers
     if (n == 0) return 1;
     int count = 0;
     while (n != 0) {
         n /= 10;
         count++;
     }
     return count;
 }
}

//Main class to test
public class CMR2 {
 public static void main(String[] args) {
     // Method reference to static method
     DigitCounter counter = NumberUtils::digitCount;

     // Input number
     int number = 123456;

     // Call the method and print result
     int digits = counter.countDigits(number);
     System.out.println("Number of digits in " + number + " is: " + digits);
 }
}
