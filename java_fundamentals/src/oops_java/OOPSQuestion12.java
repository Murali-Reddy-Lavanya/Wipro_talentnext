package oops_java;
import java.util.*;
public class OOPSQuestion12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		
		//String result=sc.nextLine();
		String result=str.substring(1,str.length()-1);
		System.out.println(result);
		sc.close();
		
		

	}

}
