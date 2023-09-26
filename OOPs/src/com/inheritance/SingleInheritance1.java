package com.inheritance;

class Vehicle1
{
	private int id;
	private String name;
	
	
	public Vehicle1()
	{
		
	}

    public Vehicle1(int id,String name)
    {
    	this.id=id;
    	this.name=name;
    }
    
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }

    public String toString()
    {
    	return "\nVehicle Id:"+id+"\nVahicle Name:"+name;
    }
}

class Car1 extends Vehicle1
{
	private int average;   
	private float price; 

    Car1()
    {
    	
    }
    
    Car1(int id, String name,int average,float price)
    {
    	super(id, name);
    	this.average=average;
    	this.price=price;
    }
    public int getAverage()
    {
    	return average;
    }
    public void setAverage(int average)
    {
    	this.average=average;
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
    	return super.toString()+"\nCar Average:"+average+"\nCar Price:"+price;
    }
}
public class SingleInheritance1 {

	public static void main(String[] args) {
		Car1 c=new Car1(101,"Maruti Suzuki",6,899999);
        System.out.println(c);
	}

}
