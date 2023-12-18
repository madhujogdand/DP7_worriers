package com.staticFinal;
/*1.	Create a class Car with String model and inttotalCarSold as static variable in main() method.
2.	Change the value of variable by class name then Print it.
3.	Create two object of Car class and change value of static variable by 1st object and print it by accessing 2nd object.
*/
public class Car {
	private String model;
	private static int totalCarSold=0;
	
	
	public Car() {
		super();
		
	}


	public Car(String model) {
		super();
		this.model = model;
		totalCarSold++;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public static int getTotalCarSold() {
		return totalCarSold;
	}


	public static void setTotalCarSold(int totalCarSold) {
		Car.totalCarSold = totalCarSold;
	}


	public static void main(String[] args) {
		
		Car c=new Car("Toyota"); 
		Car c1=new Car("Honda"); 
		Car c2=new Car("Pulsar"); 
		
		System.out.println("Car 1 model: "+c.getModel());
		System.out.println("Car 2 model: " +c1.getModel());
		System.out.println("Car 3 model: "+c2.getModel());
		System.out.println("Total cars sold: "+Car.getTotalCarSold());

		//2
		Car.totalCarSold=15;
		System.out.println("Total car sold:"+Car.totalCarSold);
		
		//3
		Car c4=new Car();
		c.totalCarSold=10;
		
		Car c5=new Car();
		System.out.println(c1.totalCarSold);
		
		
	}
   
}
