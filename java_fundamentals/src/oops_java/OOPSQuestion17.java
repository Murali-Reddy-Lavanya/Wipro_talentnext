package oops_java;
import java.util.*;
public class OOPSQuestion17 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter first string:");
	        String a = in.nextLine();
	        System.out.println("Enter second string:");
	        String b = in.nextLine();

	        StringBuilder result = new StringBuilder();

	        int minLength = Math.min(a.length(), b.length());

	        // Append alternate characters
	        for (int i = 0; i < minLength; i++) {
	            result.append(a.charAt(i));
	            result.append(b.charAt(i));
	        }

	        // Append remaining characters from the longer string
	        if (a.length() > b.length()) {
	            result.append(a.substring(minLength));
	        } else if (b.length() > a.length()) {
	            result.append(b.substring(minLength));
	        }

	        System.out.println("Merged string: " + result.toString());
	        in.close();
}

}

