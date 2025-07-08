package oops_java;
import java.util.*;
public class OOPSQuestion16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n=sc.nextInt();
		int repeat=sc.nextInt();
		
	    System.out.println(str.substring(n,str.length()).repeat(repeat));
		}
	}