package oops_java;
import java.util.*;
public class OOPSQuestion10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String s = sc.nextLine();
		System.out.println("Enter Length of the String : ");
		int n = sc.nextInt();
		System.out.println("Enter number of repetations : ");
		int r = sc.nextInt();
				
		if(s.length()>2) {
			System.out.println(s.substring(0 , n).repeat(r));
		}else {
			return;
		}
			sc.close();
	}
}

