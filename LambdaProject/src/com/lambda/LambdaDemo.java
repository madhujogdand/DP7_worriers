package com.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		// Movable car=()->{};

		Movable car = () -> {
			System.out.println("Car is moving");
		};
		car.move();

		Movable ball = () -> {
			System.out.println("Ball is rolling");
		};
		ball.move();
		
		Movable truck=()->{
			System.out.println("Truck is moving");
		};
		truck.move();

	}

}
