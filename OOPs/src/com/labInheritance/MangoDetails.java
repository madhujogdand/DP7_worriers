package com.labInheritance;

class Fruit {
	String name;
	boolean seasonal;
	String taste;
	int seeds;

	Fruit() {

	}

	Fruit(String name, boolean seasonal, String taste, int seeds) {
		this.name = name;
		this.seasonal = seasonal;
		this.taste = taste;
		this.seeds = seeds;

	}

	void display() {
		System.out.println("\nFruit name" + this.name + "\nFruit is Seasonal:" + this.seasonal + "\nTaste of fruit:"
				+ this.taste + "\nSeeds in fruit:" + this.seeds);

	}

}

class Mango extends Fruit {
	String desc;

	Mango(String name, boolean seasonal, String taste, int seeds, String desc) {
		super(name, seasonal, taste, seeds);
		this.desc = desc;
	}

	void display() {
		super.display();
		System.out.println("Description:"+desc);

	}

}
class Orange extends Fruit {
	String desc;

	Orange(String name, boolean seasonal, String taste, int seeds, String desc) {
		super(name, seasonal, taste, seeds);
		this.desc = desc;
	}

	void display() {
		super.display();
		System.out.println("Description:"+desc);

	}

}

public class MangoDetails {

	public static void main(String[] args) {
		Mango m = new Mango("Mango", true, "sweet", 1, "King of the fruit");
		m.display();
		Orange o=new Orange("Orange",true,"sour",5,"Orange is tasty fruit");
         o.display();
	}

}
