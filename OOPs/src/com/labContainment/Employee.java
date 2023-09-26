package com.labContainment;

public class Employee {

	private int id;
	private String name;
	private String desg;
	private int salary;
	private Date1 hireDate;
	
	Employee()
	{
		
	}
	
	Employee(int id, String name,String desg,int salary,Date1 hireDate)
	{
		this.id=id;
		this.name=name;
		this.desg=desg;
		this.salary=salary;
		this.hireDate=hireDate;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getDesg()
	{
		return desg;
	}
	public void setDesg(String desg)
	{
		this.desg=desg;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public Date1 getHiredate()
	{
		return hireDate;
	}
	public void setHireDate(Date1 hireDate)
	{
		this.hireDate=hireDate;
	}
	public String toString()
	{
		return "\nEmployee Id:"+id+"\nEmployee Name:"+name+"\nEmployee designation:"+desg+"\nEmployee Salary:"+salary+"\nEmployee Hiring Date:"+hireDate;
	}
	
}
