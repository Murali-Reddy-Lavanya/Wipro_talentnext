package oops_java;
import java.util.*;
public class OOPSQuestion11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		//int n=sc.nextInt();
		if(str.length()%2==0) {
			System.out.println(str.substring(0,(str.length())/2));
		}
		else {
			System.out.println("null");
		}
	}

}
