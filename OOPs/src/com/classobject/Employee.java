package com.classobject;
import java.util.Scanner;
public class Employee {
	int empid;
	String name;
	String designation;
	double bsalary;
	double hra;
	double da;
	double grossSalary;
	
	void calSalary()
	{
	        hra = (hra * bsalary)/100;
			da = (da* bsalary)/100;
		
		 grossSalary = bsalary + hra + da;
		System.out.println("Gross salary:Rs." + grossSalary);

	}
	void display()
	{
		System.out.println("Employee Id:"+empid+" Name:"+name+" Designation:"+designation+" Salary:Rs."+grossSalary);
	}	
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee s1= new Employee();
		System.out.println("Enter Employee id:");
		s1.empid=sc.nextInt();
		
		System.out.println("Enter Employee Name");
		s1.name=sc.next();
		
		System.out.println("Enter Designation: ");
		s1.designation=sc.next();
		
		System.out.println("Enter Employee salary:");
		s1.bsalary=sc.nextDouble();
		
		System.out.println("Enter HRA:");
		s1.hra=sc.nextDouble();
		
		System.out.println("Enter DA:");
		s1.da=sc.nextDouble();
		
		s1.calSalary();
       System.out.println();
       
       System.out.println("-------------------------------");
		s1.display();
	
	}

}
