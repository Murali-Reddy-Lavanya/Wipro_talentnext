package java_fundamentals;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int n=sc.nextInt();
		if(ch=='F') {
			if(n>=1 && n<=58) {
				System.out.println("Percentage Interest is 8.2%");
			}else {
				System.out.println("Percentage Interest is 9.2%");
			}
		}else {
			if(n>=1 && n<=58) {
				System.out.println("Percentage Interest is 8.4%");
			}else {
				System.out.println("Percentage Interest is 10.5%");
			}
		}

	}

}
