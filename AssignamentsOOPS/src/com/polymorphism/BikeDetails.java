package com.polymorphism;

class Bike
{
	String color;
	int speed;
	
//	Bike(String color,int speed)
//	{
//		this.color=color;
//		this.speed=speed;
//	}
	void bikeInfo()
	{
		System.out.println("Bike color:"+color);
		System.out.println("Bike speed:"+speed+"km/hr");
	}

}
class Pulser extends Bike
{
	void bikeInfo()
	{
		System.out.println("Pulser Bike color:"+color);
		System.out.println("Pulser Bike speed:"+speed+"km/hr");
	}
}
public class BikeDetails {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.color="Red";
		b.speed=60;
		b.bikeInfo();
		System.out.println();
		Pulser p=new Pulser();
		p.color="Black";
		p.speed=80;
		p.bikeInfo();

	}

}
