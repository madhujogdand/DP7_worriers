package com.labCovarient;

class Employee
{
	int id;
	String name;
	int salary;
	
	Employee()
	{
		
		
	}
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	static Employee display()
	{
		Employee e=new Employee(101,"Radha",35000);
		return e;
	}

	public String toString() {
		return "Employee Details:\nid=" + id + "\nname=" + name + "\nsalary=" + salary;
	}
	
	

}

public class EmployeeDetails {

	public static void main(String[] args) {
	  System.out.println(Employee.display());
       
	}

}
