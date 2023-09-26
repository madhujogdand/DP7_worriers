package com.classwork;

class parent {
	int x = 10;
	int y = 20;
	int z = 30;

	void display() {
		System.out.println(x + y);
		System.out.println(x + z);
		System.out.println(y + z);
		System.out.println(x + y + z);
	}
}

class Child extends parent {
	int x = 20;

	void display() {
		System.out.println("Parent value of X:" + super.x);
		System.out.println("Child value of X:" + x);
		System.out.println(super.x + x);
		System.out.println(x + super.x + y);
		System.out.println(super.x + x + z);
		super.display();
	}

}

public class UseOfSuperKeyword {
	public static void main(String[] args) {

		Child c=new Child();
		c.display();
	}
}
