package oops_java;

class Fruit{
	String name;
	String taste;
	String size;
	
	public Fruit(String name, String taste, String size) {
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	

    public void eat() {
        System.out.println("The fruit is " + name + " and it tastes " + taste);
    }
}

class Apple extends Fruit {
    public Apple(String taste, String size) {
        super("Apple", taste, size);
    }

    @Override
    public void eat() {
        System.out.println("The apple tastes " + taste);
    }
}

class Orange extends Fruit {
    public Orange(String taste, String size) {
        super("Orange", taste, size);
    }

    @Override
    public void eat() {
        System.out.println("The orange tastes " + taste);
    }
}

public class OOPSQuestion6 {
    public static void main(String[] args) {
        Apple apple = new Apple("sweet", "medium");
        Orange orange = new Orange("sour", "small");

        apple.eat();
        orange.eat();
    }
    
}