package com.operators;

import java.util.Scanner;

public class AreaOFCircle {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double area, perimeter;

		// ctrl+space : to give options
		System.out.println("Enter the radius:");

		double radius = sc.nextDouble();

		area = Math.PI * radius * radius;

		perimeter = 2 * Math.PI * radius;

		System.out.println("Area is :" + area);
		
		System.out.println("Perimeter is:" + perimeter);

		sc.close();

	}

}