package com.interfacedemo;

interface Movable {
	void move();
}

interface Printable extends Movable {
	void printMe(String name);
}

class Car implements Printable {
	public void move() {
		System.out.println("car is moving with the speed of:100km/hr");
	}

	public void printMe(String name) {
		System.out.println("My car name is" + name);

	}
}

public class ExtendsInterface {

	public static void main(String[] args) {
		Movable m;
		m=new Car();

		m.move();
		
		Printable p;
		p=new Car();
		p.move();
		p.printMe("BMW");
	}

}

