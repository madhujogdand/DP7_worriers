package com.labcodes;

class Vehicle1
{
	int id;
	String name;
	int price;

	Vehicle1()
	{
		this(100, "Aaru", 90000);
		System.out.println("Default Constructor");
	}

	Vehicle1(String name, int price)
	{
		this.name = name;
		this.price = price;
	}

	Vehicle1(int id, String name, int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	void showDetails()
	{
		System.out.println("\nvehicle id:" + id + "\nvehicale name:" + name + "\nvehicle price:" + price);

	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Vehicle1 v2 = new Vehicle1();
		v2.showDetails();

	}

}
