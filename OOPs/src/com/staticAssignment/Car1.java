package com.staticAssignment;

public class Car1 {
	private String model;
	private static int totalCarSold;

	public static void main(String[] args) {
//		System.out.println("Model : " + model); // a/c- Need to create object to access instance variables
		System.out.println("Total Car Sold: " + totalCarSold); // b- yes we can access static variables in static methods
	}
	
	public void method1() {
		System.out.println("Static variable : "+ totalCarSold); // d- yes we can access static variable in non static method
	}
	
	public void method2() {
		System.out.println("Not Static variable : "+ model); // e- yes we can access not static variable in non static method
	}
	
	//5.overload static method
	public static void method1(int n) {
		System.out.println("Static variable : "+ totalCarSold); // d- yes we can access static variable in non static method
	}
}


