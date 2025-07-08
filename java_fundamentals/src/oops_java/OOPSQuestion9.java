package oops_java;
import java.util.*;
public class OOPSQuestion9 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking two string inputs
	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine();

	        // Check for double character at join point (case-insensitive)
	        if (!str1.isEmpty() && !str2.isEmpty() &&
	            Character.toLowerCase(str1.charAt(str1.length() - 1)) == Character.toLowerCase(str2.charAt(0))) {
	            str2 = str2.substring(1); // remove duplicate character from str2
	        }

	        // Concatenate with space and convert to lowercase
	        String result = (str1 + " " + str2).toLowerCase();

	        // Output
	        System.out.println("Result: " + result);
	    }
}
