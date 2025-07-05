package java_fundamentals;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(Character.isAlphabetic(a)) {
			System.out.println("Alphabet");
		}else if(Character.isDigit(a)) {
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}
		sc.close();

	}

}
