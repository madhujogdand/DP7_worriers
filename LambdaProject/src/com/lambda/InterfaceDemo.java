package com.lambda;

interface Movable
{
	abstract void move();
	
	default void changeSpeed()
	{
		System.out.println("Speed increased...");
	}

}
public class InterfaceDemo implements Movable {

	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	public static void main(String[] args) {
		Movable car=new InterfaceDemo();
		car.move();
		
		Movable truck=new InterfaceDemo();
		truck.move();
	}
}
