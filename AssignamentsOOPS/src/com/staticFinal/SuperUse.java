package com.staticFinal;

class Vehicle
{
    String vehicleType;
    
    Vehicle(String type)
    {
        this.vehicleType = type;
    }
    void start()
    {
        System.out.println(vehicleType + " starting...");
    }
    void stop()
    {
        System.out.println(vehicleType + " stopping...");
    }
}

class Car2 extends Vehicle
{
    String carType;

    Car2(String carType)
    {
        super("Car"); 
        this.carType = carType;
    }

    @Override
    void start()
    {
        super.start(); 
        System.out.println(carType + " car is starting...");
    }

    void accelerate()
    {
        System.out.println(carType + " car is accelerating...");
    }
}

public class SuperUse
{
	 public static void main(String[] args)
	 {
	        Car2 c2 = new Car2("Creta");
	        c2.start();
	        c2.stop();
	        c2.accelerate();
	    }

}