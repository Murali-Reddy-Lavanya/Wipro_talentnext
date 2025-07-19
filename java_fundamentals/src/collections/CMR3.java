package collections;
//Functional interface with one abstract method
@FunctionalInterface
interface FactorialInterface {
 int calculate(int n);
}

//Class with an instance method to compute factorial
class FactorialCalculator {
 public int factorial(int n) {
     if (n < 0) return -1; // Handle negative input
     int result = 1;
     for (int i = 2; i <= n; i++) {
         result *= i;
     }
     return result;
 }
}

//Main class to test everything
public class CMR3 {
 public static void main(String[] args) {
     // Create object of class with instance method
     FactorialCalculator fc = new FactorialCalculator();

     // Use method reference to refer to the factorial() method
     FactorialInterface fi = fc::factorial;

     // Test with input
     int input = 5;
     int output = fi.calculate(input);

     // Output result
     System.out.println("Factorial of " + input + " is: " + output);
 }
}

