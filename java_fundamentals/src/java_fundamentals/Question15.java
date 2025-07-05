package java_fundamentals;
import java.util.*;
public class Question15 {

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int num = in.nextInt(); 
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}