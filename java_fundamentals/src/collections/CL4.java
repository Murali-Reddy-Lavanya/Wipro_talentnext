package collections;
//WordCount.java
@FunctionalInterface
interface WordCount {
 int count(String str);
}

//MyClassWithLambda.java
public class CL4 {
 public static void main(String[] args) {
     // Lambda expression to count words in a string
     WordCount wc = str -> {
         if (str == null || str.trim().isEmpty()) {
             return 0;
         }
         // Split by one or more spaces
         String[] words = str.trim().split("\\s+");
         return words.length;
     };

     // Sample input
     String input = "Java is a powerful programming language";

     // Use the lambda to count words
     int wordCount = wc.count(input);

     // Output the result
     System.out.println("Input: " + input);
     System.out.println("Number of words: " + wordCount);
 }
}

