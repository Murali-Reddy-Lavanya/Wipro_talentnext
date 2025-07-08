package oops_java;
import java.util.*;
public class OOPSQuestion14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()>=2 && str.charAt(0)== 'x' && str.charAt(str.length()-1)=='x') {
			System.out.println(str.substring(1,str.length()-1));
		}else {
			System.out.println(str);
			
		}
		sc.close();

	}

}
