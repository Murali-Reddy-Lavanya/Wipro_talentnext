package java_fundamentals;
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      int original=in.nextInt();
      int n=original;
      int rev=0;
      while(n>0) {
    	  int digit=n%10;
    	  rev=rev*10+digit;
    	  n /=10;
    	  
      }  
    	  if(original==rev) {
    		  System.out.println("Is palindrome");
    	  }else {
    		  System.out.println("Not a palindrome");
    	  }
      }
	

}