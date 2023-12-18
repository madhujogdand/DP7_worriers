package com.lab;

class Bike implements Comparable<Bike> {
	private int id;
	private String name;
	private double price;
	private int modYr;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int id, String name, double price, int modYr) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.modYr = modYr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getModYr() {
		return modYr;
	}

	public void setModYr(int modYr) {
		this.modYr = modYr;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + ", modYr=" + modYr + "]";
	}

	@Override
	public int compareTo(Bike b) {
		if (this.price == b.price)
			return (this.name.compareTo(b.name));
		else if (this.getPrice() < b.getPrice())
			return -1;
		else
			return 1;
	}

}
