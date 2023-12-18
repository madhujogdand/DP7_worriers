package com.lambda;

public class AnnonymousInner {
	public static void main(String[] args) {

		Movable car = new Movable()
		{
			@Override
			public void move()
			{
				System.out.println("Car is moving");
			}
		};
		Movable ball=new Movable() {
			
			@Override
			public void move() {
				System.out.println("Ball is rolling");
				
			}
		};
		
		car.move();
		ball.move();
	}
}
