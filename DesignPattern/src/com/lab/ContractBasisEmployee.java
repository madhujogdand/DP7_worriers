package com.lab;

public class ContractBasisEmployee extends Employee {

	
	
	
	public ContractBasisEmployee() {
		super();
		
	}

	public ContractBasisEmployee(String name, double basicSalary) {
		super(name, basicSalary);
	
	}

	@Override
	public void calSalary() {
       double salary=basicSalary+(basicSalary*0.5);
		
        System.out.println("FullTime employee salary: "+salary);
     
	}

	@Override
	public void WorkingHours() {
		int noOfWorkingHours=6;
		  System.out.println("No of working hours: "+noOfWorkingHours);
	}

}
