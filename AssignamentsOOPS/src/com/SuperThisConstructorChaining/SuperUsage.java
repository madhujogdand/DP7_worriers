package com.SuperThisConstructorChaining;

class Car
{
	int carId;
	String name;
	
	Car()
	{
		
	}
	Car(int carId,String name)
	{
		this.carId=carId;
		this.name=name;
	}
	
	public String toString() {
		return "Car details:\ncarId=" + carId + "\nName=" + name;
	}
    
}
class RacingCar extends Car
{
	String type;
	String model;
	
	RacingCar()
	{
		
	}
	RacingCar(int carId,String name,String type,String model)
	{
		super(carId,name);
		this.type=type;
		this.model=model;
		
	}
	public String toString()
	{
		return super.toString()+"\nRacingCar Details:\nType:"+type+"\nModel:"+model;
		
	}
}
public class SuperUsage {

	public static void main(String[] args) {
		RacingCar r=new RacingCar(101,"Ferrari","Diesel","Aug21");
         System.out.println(r);
	}

}
