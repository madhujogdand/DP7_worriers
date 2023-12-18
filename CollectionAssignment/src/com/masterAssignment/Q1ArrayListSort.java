package com.masterAssignment;

import java.util.ArrayList;
import java.util.Collections;

/*1. Write the necessary code to sort employee objects by empId.*/
class Employee implements Comparable<Employee>
{
	private int empId;
	private String name;

	// your code goes here.
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.empId-o.empId;
	}

}

public class Q1ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4, "Suman");
		Employee e3 = new Employee(2, "Radhika");
		Employee e4 = new Employee(1, "Sameer");
		alEmp.add(e1);
		alEmp.add(e2);
		alEmp.add(e3);
		alEmp.add(e4);
// your code to call sort function goes here.
		System.out.println(alEmp);

		System.out.println("===========================================");
		Collections.sort(alEmp);
		System.out.println(alEmp);
		
	}
}
