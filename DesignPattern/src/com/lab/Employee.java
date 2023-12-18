package com.lab;

public abstract class Employee {

	String name;
	int noOfWorkingHours;
	double basicSalary;

	public Employee() {

	}

	public Employee(String name, double basicSalary) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public abstract void calSalary();

	public abstract void WorkingHours();

}
