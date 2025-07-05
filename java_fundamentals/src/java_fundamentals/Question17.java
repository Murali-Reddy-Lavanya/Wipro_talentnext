package java_fundamentals;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    int sum=0;
    int n=in.nextInt();
     while(n>0) {
	  int digit= n%10;
	   sum+=digit;
	   n/=10;
   }
     System.out.println(sum);
	}
      
}