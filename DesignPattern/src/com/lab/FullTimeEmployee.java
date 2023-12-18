package com.lab;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee() {
		super();

	}

	public FullTimeEmployee(String name, int basicSalary) {
		super(name, basicSalary);

	}

	@Override
	public void calSalary() {
		double salary=basicSalary+(basicSalary*1.5);
		
        System.out.println("FullTime employee salary: "+salary);
     
	}

	@Override
	public void WorkingHours() {
        int noOfWorkingHours=8;
        System.out.println("No of working hours: "+noOfWorkingHours);
	}

}
