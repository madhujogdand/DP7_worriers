package com.lablooseCoupling;

abstract class Car
{
	String bName;
	int price;
	
	public Car(String bName, int price)
	{
		super();
		this.bName = bName;
		this.price = price;
	}
	
	public String toString() {
		return "car [bName=" + bName + ", price=" + price + "]";
	}
}
class Maruti extends Car
{

	public Maruti(String bName, int price)
	{
		super(bName, price);
		
	}
	
}
public class TightCoupling {

	public static void main(String[] args) {
		Maruti m=new Maruti("Maruti",90000);
		System.out.println(m);
	

	}

}
