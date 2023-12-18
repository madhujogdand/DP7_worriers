package com.arrayContainment;

import java.util.Scanner;

public class CarGetterSetter {
	static Scanner sc = new Scanner(System.in);

	static void enterDetails(Car cr)
	{
		System.out.println("Enter Car Name:");
		cr.setName(sc.next());
		System.out.println("Enter Car Price:");
		cr.setPrice(sc.nextFloat());
		
		cr.setD(new Driver());
		System.out.println("Enter Driver Id:");
		cr.getD().setId(sc.nextInt());
		System.out.println("Enter Driver Name:");
		cr.getD().setName(sc.next());
		System.out.println("Enter Driver Age:");
		cr.getD().setAge(sc.nextInt());
		System.out.println("Enter Driver Salary:");
		cr.getD().setSalary(sc.nextFloat());
	}
    static void printDetails(Car cr[])
    {
    	for(Car c:cr)
    	{
    		System.out.println(c);
    	}
    }
	public static void main(String[] args) {
		Car cr[] = new Car[5];
		for (int i = 0; i < cr.length; i++) {
			cr[i] = new Car();
			enterDetails(cr[i]);

		}
		System.out.println("------------------------------------------------");
		printDetails(cr);
	}

}
