package oops_java;
import java.util.*;
public class OOPSQuestion20 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      String names[]=new String[n];
	      Optional<String> optional= Optional.ofNullable(names[0]);
	      
	      int length=optional.map(String::length).orElse(0);
	      System.out.println(length);
	      sc.close();
		}

	}