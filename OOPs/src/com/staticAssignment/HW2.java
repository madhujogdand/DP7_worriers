package com.staticAssignment;

class Employee
{
	private int empId;
	private String name;
	private double salary;
	private static int totalEmp=0;

	Employee()
	{

	}
	
	Employee(int empId, String name, int salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		totalEmp++;
    }
	public void display()
	{
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
	}
	
	public static int totalEmp()
	{
		return totalEmp;
	}
}

public class HW2 {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Radha",45000);
		Employee e2=new Employee(102, "Neha",35000);
		Employee e3=new Employee(103, "Aashu",48000);
		Employee e4=new Employee(104, "Dhruti",43000);
		Employee e5=new Employee(105, "Aarya",51000);

		e1.display();
		System.out.println();
		e2.display();
		System.out.println();
		e3.display();
		System.out.println();
		e4.display();
		System.out.println();
		e5.display();
		
		System.out.println();
		System.out.println("Total no of employees:"+Employee.totalEmp());
	}

}
