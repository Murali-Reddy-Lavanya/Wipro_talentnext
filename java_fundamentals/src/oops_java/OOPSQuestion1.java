package oops_java;

import java.util.*;

class Box {
	double width;
	double height;
	double depth;
	
	public Box(double w,double h,double d) {
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	public double calculateVolume() {
		return width*height*depth;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Width,Height,Depth");
		double w= sc.nextDouble();
		double h=sc.nextDouble();
		double d=sc.nextDouble();
		Box mybox = new Box(w,h,d);
		mybox.calculateVolume();
		System.out.println("The volume is " +mybox.calculateVolume());
		sc.close();
	}
}
