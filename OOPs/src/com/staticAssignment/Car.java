package com.staticAssignment;

public class Car {

		protected String model;
		protected static int totalCarSold;
		
		public static void main(String[] args) {
			//2
			Car.totalCarSold = 10;
			System.out.println("Total Car Sold: " + Car.totalCarSold);
			
			//3
			Car car1 = new Car();
			car1.totalCarSold = 25;
			
			Car car2 = new Car();
			System.out.println(car2.totalCarSold);
		}
		
		
	}


