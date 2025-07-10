package oops_java;
import java.util.*;
public class OOPSQuestion19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		        // Input for s1
		        System.out.print("Enter number of cities for s1: ");
		        int n1 = scanner.nextInt();
		        scanner.nextLine(); // consume newline
		        StringJoiner s1 = new StringJoiner("-");
		        System.out.println("Enter " + n1 + " city names for s1:");
		        for (int i = 0; i < n1; i++) {
		            String city = scanner.nextLine().trim();
		            s1.add(city);
		        }

		        // Input for s2
		        System.out.print("Enter number of cities for s2: ");
		        int n2 = scanner.nextInt();
		        scanner.nextLine(); // consume newline
		        StringJoiner s2 = new StringJoiner("-");
		        System.out.println("Enter " + n2 + " city names for s2:");
		        for (int i = 0; i < n2; i++) {
		            String city = scanner.nextLine().trim();
		            s2.add(city);
		        }

		        // Case i: s1 merged to s2
		        StringJoiner merged1 = new StringJoiner("-");
		        merged1.merge(s1);
		        merged1.merge(s2);
		        System.out.println("i) s1 merged to s2: " + merged1);

		        // Case ii: s2 merged to s1
		        StringJoiner merged2 = new StringJoiner("-");
		        merged2.merge(s2);
		        merged2.merge(s1);
		        System.out.println("ii) s2 merged to s1: " + merged2);

		        scanner.close();
		    }
		}