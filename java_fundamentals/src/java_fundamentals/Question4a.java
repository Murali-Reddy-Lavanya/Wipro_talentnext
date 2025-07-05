package java_fundamentals;

import java.util.Scanner;

public class Question4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Interger:");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("The number is positive");
		}else if (num <0) {
			System.out.println("The number is negative");
		}else {
			System.out.println("The number is zero ");
		}
		sc.close();

	}

}
