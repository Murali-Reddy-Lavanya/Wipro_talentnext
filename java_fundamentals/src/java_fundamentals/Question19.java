package java_fundamentals;
import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int rev=0;
       int n=in.nextInt();
       while(n>0) {
    	   int digit=n%10;
    	   rev=rev*10+digit;
    	   n /=10;
    	   
       }
       System.out.println(rev);
	}

}