package com.innerDemo;

interface Doable {
	public void doIt();
}

class Car {
	public void drive() {
		System.out.println("I am driving a car");
	}
}

abstract class Cake {
	void doBaking() {
		System.out.println("I am baking a cake");
	}
}

public class AnnonymusInnerclass {

	public static void main(String[] args) {

		// using interface
		Doable d = new Doable() {
			@Override
			public void doIt() {
				System.out.println("I am doing my homework");
			}
		};
		d.doIt();

		// using concrete class

		Car c1 = new Car() {
			public void drive() {
				System.out.println("I am driving a car");
			}
		};

		c1.drive();

		// using abstract class
		Cake ck = new Cake() {
			void doBaking() {
				System.out.println("I am baking a cake");
			}
		};
		ck.doBaking();

	}

}
