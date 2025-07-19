package collections;
//Functional interface with a method that accepts an int and returns an object
@FunctionalInterface
interface PrimeChecker {
 MyPrime check(int n);
}

//User-defined class with parameterized constructor
class MyPrime {
 public MyPrime(int number) {
     if (isPrime(number)) {
         System.out.println(number + " is Prime");
     } else {
         System.out.println(number + " is Not Prime");
     }
 }

 // Method to check prime
 private boolean isPrime(int num) {
     if (num <= 1) return false;
     for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) return false;
     }
     return true;
 }
}

//Main class to test
public class CMR1 {
 public static void main(String[] args) {
     // Constructor reference
     PrimeChecker checker = MyPrime::new;

     // Invoke the constructor via functional interface
     checker.check(17); // Output: 17 is Prime
     checker.check(10); // Output: 10 is Not Prime
 }
}
