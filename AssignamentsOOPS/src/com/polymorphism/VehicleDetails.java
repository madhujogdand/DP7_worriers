package com.polymorphism;
//3
class Vehicle
{
	String accelerate(long mph)
	{
		return "Vehicle is accelerating to:"+mph+"mph.";
	}
	
	String stop()
	{
		return "Vehicle has stopped";
	}
	String run()
	{
		return "Vehicle is running";
	}
}
class Car extends Vehicle
{
	String accelerate(long mph)
	{
		return "Car is accelerating to:"+mph+"mph.";
	}
}
public class VehicleDetails {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		System.out.println(v.accelerate(60));
		System.out.println(v.stop());
		System.out.println(v.run());
		Car c=new Car();
		System.out.println(c.accelerate(50));
		System.out.println(c.stop());
		System.out.println(c.run());

	}

}
