package java_fundamentals;

import java.util.*;

public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month number");
		int mno = sc.nextInt();
		String mName;
		switch (mno) {
		case 1:
			mName = "January";
			break;
		case 2:
			mName = "February";
			break;
		case 3:
			mName = "March";
			break;
		case 4:
			mName = "April";
		case 5:
			mName = "May";
			break;
		case 6:
			mName = "June";
		case 7:
			mName = "July";
			break;
		case 8:
			mName = "August";
			break;
		case 9:
			mName = "September";
			break;
		case 10:
			mName = "October";
			break;
		case 11:
			mName = "November";
			break;
		case 12:
			mName = "December";
			default:
				mName = "Invalid Code";
		}
		System.out.println(mName);
		sc.close();

	}

}
