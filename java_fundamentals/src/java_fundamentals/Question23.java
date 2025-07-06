package java_fundamentals;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 4, 34, 56, 7};
        int search = 90;
        int index = -1; 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                index = i; 
                break;    
            }
        }

        System.out.println(index);
        sc.close();
        
    }
}
