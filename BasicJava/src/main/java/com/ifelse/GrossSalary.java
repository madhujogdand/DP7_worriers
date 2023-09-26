package com.ifelse;

import java.util.Scanner;

public class GrossSalary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary:");
		double basicsalary = sc.nextDouble();
		double hra, da, grossSalary;

		if (basicsalary <= 10000)
		{
			hra = 0.2 * basicsalary;
			da = 0.8 * basicsalary;
		} 
		else if (basicsalary <= 20000)
		     {
			   hra = 0.25 * basicsalary;
			   da = 0.9 * basicsalary;
		     } 
		     else 
		     {
			   hra = 0.3 * basicsalary;
			   da = 0.95 * basicsalary;
		     }
		grossSalary = basicsalary + hra + da;
		System.out.println("Gross salary: " + grossSalary);

		sc.close();
	}

}
