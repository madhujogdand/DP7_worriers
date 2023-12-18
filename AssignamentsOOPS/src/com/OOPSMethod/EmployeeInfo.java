package com.OOPSMethod;
//5
class Employee
{
	int id;
	String name;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("Employee id:"+id+"\nEmployee name:"+name);
	}
	
}
public class EmployeeInfo {

	public static void main(String[] args) {
		Employee e= new Employee(101, "Priya");
          e.display();
	}

}
