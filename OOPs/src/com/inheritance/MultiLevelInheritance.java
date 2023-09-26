package com.inheritance;

class Vehicle{
	
	private int id;
	private int model;
	protected float price;
	
	public  Vehicle()
	{
		super();
	}
	
	public Vehicle(int id, int model, float price)
	{
		super();
		this.id=id;
		this.model=model;
		this.price=price;
		
	}
	 public int getId()
	    {
	    	return id;
	    }
	public void setId(int id)
	    {
	    	this.id=id;
	    }
	 public int getModel()
	    {
	    	return model;
	    }
	public void setModel(int model)
	    {
	    	this.model=model;
	    }
	 public float getPrice()
	    {
	    	return price;
	    }
	public void setPrice(float price)
	    {
	    	this.price=price;
	    }
	public String toString()
	{
		return "Id:"+id+"\nModel"+model+"\nPrice:"+price;
	}
}
class Car extends Vehicle
{
	private String name;
	private int noOfgears;
	private String fueltype;
	
	Car()
	{
		super();
	}

	Car(int id, int model, float price,String name,int noOfgears,String fueltype)
	{
		super(id, model,price);
		this.name=name;
		this.noOfgears=noOfgears;
		this.fueltype=fueltype;
	}
	
	 public String getName()
	    {
	    	return name;
	    }
	public void setName(String name)
	    {
	    	this.name=name;
	    }
	 public int getNoOfgears()
	    {
	    	return noOfgears;
	    }
	public void setNoOfgears(int noOfgears)
	    {
	    	this.noOfgears=noOfgears;
	    }
	 public String getFueltype()
	    {
	    	return fueltype;
	    }
	public void setFueltype(String fueltype)
	    {
	    	this.fueltype=fueltype;
	    }
    public String toString()
    {
    	return super.toString()+"\nName"+name+"\nNoOfGears:"+noOfgears+"\nFuel Type:"+fueltype;
    }
    
}
class RacingCar extends Car
{
	private float maxSpeed;
	private float mileage;
	
	
	public RacingCar()
	{
		super();
		
	}
	public RacingCar(int id, int model, float price, String name, int noOfgears, String fueltype,float maxSpeed,float mileage)
	{
		super(id, model, price, name, noOfgears, fueltype);
		   this.maxSpeed=maxSpeed;
		   this.mileage=mileage;
	}
	public float getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	
	public String toString() {
		return "RacingCars \nmaxSpeed:" + maxSpeed + "\nmileage:" + mileage;
	}

  }

public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		Car bmw=new Car(101,2022,450000f,"BMWX1",6,"petrol");
		System.out.println(bmw);
		System.out.println();
		bmw.price=550000f;//protected member of vehicle
	    System.out.println(bmw);
		System.out.println();
	    RacingCar rc1= new RacingCar(102, 2023, 6700000, "Formula1", 6, "Diesel",400f ,30f);
	    System.out.println(rc1);
	    System.out.println();
	    rc1.price=7700000f;
	}

}
