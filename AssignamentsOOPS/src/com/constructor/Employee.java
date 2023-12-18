package com.constructor;
//11
public class Employee {
	private int empId;
	private String empName;
	private int sal;
	
	Employee()
	{
		
	}
	Employee(int empId,String empName,int sal)
	{
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}

	public String toString() {
		return "Employee Details:\nEmployee Id:" + empId + "\nEmployee Name:" + empName + "\nSalary:" + sal;
	}
	public static void main(String[] args) {
		Employee e=new Employee(101,"Madhu",45000);
		System.out.println(e);
	}
}
