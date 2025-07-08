package oops_java;
import java.util.*;
public class OOPSQuestion13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		if(a.length()<b.length()) {
			System.out.println(a+b+a);
		}else if(a.length()==0 && b.length()==0) {
			System.out.println("Give String");
		}
		sc.close();
	}

}
