package java_fundamentals;

import java.util.Scanner;

public class Question22 {
		    public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		       
		        int[] numbers = {25, 10, 85, 40, 5};

		        
		        int max = numbers[0];
		        int min = numbers[0];

		        
		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] > max) {
		                max = numbers[i];
		            }
		            if (numbers[i] < min) {
		                min = numbers[i];
		            }
		        }

		        
		        System.out.println("Maximum value = " + max);
		        System.out.println("Minimum value = " + min);
		        sc.close();
		    }
		}
