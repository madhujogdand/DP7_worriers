package com.labcodes;

class Mobile {
	int id;
	String name;
	int price;

	Mobile() {

	}

	Mobile(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	void checkMobile() {
		if (price > 25000) {
			System.out.println(name);
		}
	}

}

public class MobileDetails {

	public static void main(String[] args) {
		Mobile m1 = new Mobile(101, "Realme", 28000);
		m1.checkMobile();
		Mobile m2 = new Mobile(102, "Samsung", 30000);
		m2.checkMobile();
		Mobile m3 = new Mobile(103, "Vivo", 23000);
		m3.checkMobile();
	}

}
