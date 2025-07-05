package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a= sc.next().charAt(0);
		char b= sc.next().charAt(0);
		if(a<b) {
			System.out.println(a+ "," +b);
		}
		else {
			System.out.println(b+ "," +a);
		}
		sc.close();

	}

}
