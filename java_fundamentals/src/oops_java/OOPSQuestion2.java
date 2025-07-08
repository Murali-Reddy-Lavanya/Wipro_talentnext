package oops_java;

import java.util.*;

 class Calculator {	 
     public static int powerInt(int num1, int num2) {
			return (int) Math.pow(num1, num2);
		}

		public static double powerDouble(double num1, double num2) {
			return Math.pow(num1, num2);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = Calculator.powerInt(a, b);
			System.out.println(a + " to the power " + b +" is "+ result);
			
			
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double res = Calculator.powerDouble(c, d);
			System.out.println(c + " to the power " + d +" is "+ res);
			sc.close();

		}
	}


