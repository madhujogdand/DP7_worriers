package com.labcodes;

class Vehicle {
	int id;
	String name;
	int price;

	Vehicle()
	{
		this.id=id;
	    this.name=name;
	    this.price=price;
	}
	Vehicle(int id,String name,int price)
	{
       this.id=id;
       this.name=name;
       this.price=price;
	}
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.price);
	}
	
	void showDetails()
	{
		System.out.println("\nvehicle id:"+id+"\nvehicale name:"+name+"\nvehicle price:"+price);
	    display();
	}
}

public class VehicleDetails {

	public static void main(String[] args) {
       Vehicle v1=new Vehicle(101,"Unicorn",90000);
       v1.showDetails();
       
        Vehicle v2=new Vehicle();
       v2.showDetails();
       
       
       Vehicle v3=new Vehicle(101,"FZ",95000);
       v3.display();
	}

}
