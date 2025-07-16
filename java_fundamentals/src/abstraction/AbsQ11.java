package abstraction;
import java.util.Scanner;

//Custom Exception for Negative Marks
class NegativeValueException extends Exception {
 public NegativeValueException(String message) {
     super(message);
 }
}

//Custom Exception for Marks Out of Range
class OutOfRangeException extends Exception {
 public OutOfRangeException(String message) {
     super(message);
 }
}

public class AbsQ11 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     final int studentCount = 2;
     final int subjectCount = 3;

     for (int i = 1; i <= studentCount; i++) {
         try {
             System.out.println("\nEnter name of Student " + i + ":");
             String name = sc.nextLine();

             int[] marks = new int[subjectCount];
             int total = 0;

             for (int j = 0; j < subjectCount; j++) {
                 System.out.println("Enter marks for subject " + (j + 1) + ":");
                 String input = sc.nextLine();

                 int mark = Integer.parseInt(input); // may throw NumberFormatException

                 if (mark < 0) {
                     throw new NegativeValueException("Negative marks not allowed.");
                 }
                 if (mark > 100) {
                     throw new OutOfRangeException("Marks cannot exceed 100.");
                 }

                 marks[j] = mark;
                 total += mark;
             }

             double average = (double) total / subjectCount;
             System.out.println("Average marks of " + name + " = " + average);

         } catch (NumberFormatException e) {
             System.out.println("NumberFormatException: Please enter only integer values for marks.");
         } catch (NegativeValueException | OutOfRangeException e) {
             System.out.println("Invalid Mark: " + e.getMessage());
         }
     }

     sc.close();
 }
}

