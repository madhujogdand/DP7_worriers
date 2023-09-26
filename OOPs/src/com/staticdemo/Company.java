package com.staticdemo;

class Employee
{
	private int id;
	private String name;
	private float salary;
	static int eCount=0;
	static String companyName;
	
	{
		eCount++;
	}
	static 
	{
		companyName="Think Quotient";
	}
	static void changeName(String cName)
	{
		companyName=cName;
	}
	
	Employee()
	{
	
		
	}
	
	Employee(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
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
	public float getSalary()
	{
		return salary;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" "+companyName;
	}
	
}

public class Company {

	public static void main(String[] args) {
		Employee e=new Employee(101,"Shivansh",58000);
		Employee e1=new Employee(102,"Radha",54000);
		Employee e2=new Employee(103,"Neha",35000);
		Employee e3=new Employee(104,"Aashu",50000);
		
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("Company Name:"+Employee.companyName);
		 Employee.changeName("TCS");
	    
		System.out.println("Number of employee:"+Employee.eCount);
	    
	    System.out.println("----------------After change---------------");
       
	    System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	    
	    
	}
	

}
