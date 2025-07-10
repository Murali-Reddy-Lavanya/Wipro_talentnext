package oops_java;
import java.util.*;
public class OOPSQuestion18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				        // Example ArrayList of names
		        ArrayList<String> names = new ArrayList<>();
		        names.add("Alice");
		        names.add("Bob");
		        names.add("Charlie");

		        // Create StringJoiner with comma as delimiter
		        StringJoiner joiner = new StringJoiner(", ", "{", "}");

		        // Add each name to the joiner
		        for (String name : names) {
		            joiner.add(name);
		        }

		        // Convert to string
		        String result = joiner.toString();

		        // Output the result
		        System.out.println(result);

	}

}
