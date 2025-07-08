package oops_java;
import java.util.*;
public class OOPSQuestion8 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give me a String: ");
		String s=sc.nextLine();
		String rev=new StringBuilder(s).reverse().toString();
		if(s.equals(rev)) {
			System.out.println(s+ " is a palindrome");
		}else {
			System.out.println(s+ " is not a palindrome");
		}
		sc.close();
		
	}
}
