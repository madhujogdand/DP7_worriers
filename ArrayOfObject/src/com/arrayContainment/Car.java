package com.arrayContainment;

public class Car {
	private String name;
	private float price;
	private Driver d;
	
	public Car() {
		super();
		
	}
	public Car(String name, float price, Driver d) {
		super();
		this.name = name;
		this.price = price;
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Driver getD() {
		return d;
	}
	public void setD(Driver d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", d=" + d + "]";
	}
	
	

}
