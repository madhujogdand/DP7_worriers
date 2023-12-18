package com.lab;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee (fulltime,contract)");
		String dtype =sc.next();
		
		GetEmployeeType ge=new GetEmployeeType();
		  Employee e=ge.getEmployee(dtype);
	        if(e==null)
	        {
	        	System.out.println("Employee not found.....");
	        }
	        else
	        {
	        	System.out.println("-----------------------------------");
	        	System.out.println("Enter emloyee name:");
	        	e.setName(sc.next());
	        	
	        	System.out.println("Enter emloyee salary:");
	        	e.setBasicSalary(sc.nextDouble());
	        	
	        	System.out.println("=====================================");
	        	
	        	System.out.println("Welcome to our company..."+e.getName());
	        	e.getBasicSalary();
	        	System.out.println("Salary paid:"+e.basicSalary);
	        	e.WorkingHours();
	        	//System.out.println("Number of working hours:"+e.noOfWorkingHours);
	             e.calSalary();
	          
	        	
	        	System.out.println("===========================================");
	        }

	}

}
