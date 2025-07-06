package java_fundamentals;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] asciiValues = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
        for (int i = 0; i < asciiValues.length; i++) {
            System.out.print((char) asciiValues[i]);
            sc.close();
        }
    }
}
