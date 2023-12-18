package com.containment;

class MyDate

{
  private int day;
  private String month;
  private int year;
  
  MyDate()
  {
	  
	  
  }
  MyDate(int day, String month,int year)
  {
	  this.day=day;
	  this.month=month;
	  this.year=year;
	  
  }
  
  public int getDay()
  {
	  return day;
  }
  public void setDay(int day)
  {
	  this.day=day;
  }
  public String getMonth()
  {
	  return month;
  }
  public void setMonth(String month)
  {
	  this.month=month;
  }
  public int getYear()
  {
	  return year;
  }
  public void setYear(int year)
  {
	  this.year=year;
  }
  public String toString()
  {
	  return day+" "+month+" "+year;
  }
}
class Department1
{
   private int deptId;
   private String deptName;
  
   
   Department1()
   {
	   
   }
	
   Department1(int deptId,String deptName)
   {
	   this.deptId=deptId;
	   this.deptName=deptName;
	   
   }
	 public int getDeptId()
	 {
		 return deptId;
	 }
	 public void setDeptId(int deptId)
	 {
		 this.deptId=deptId;
	 }
	 public String getDeptName()
	 {
		 return deptName;
	 }
	 public void setDeptName(String deptName)
	 {
		 this.deptName=deptName;
	 }
	
	
	public String toString()
	{
		return "\nId:"+deptId+"\nDepartment Name:"+deptName;
	}
	
}
class Employee1
{
	private int id;
	private String name;
	private int salary;
	private Department1 dept;
	private MyDate m;
	
	Employee1()
	{
		
	}
	Employee1(int id,String name,int salary,Department1 dept,MyDate m)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		this.m=m;
		
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
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public Department1 getDept()
	{
		return dept;
	}
	public void setDept(Department1 dept)
	{
		this.dept=dept;
	}
	public MyDate getM()
	{
		return m;
	}
	public void setM(MyDate m)
	{
		this.m=m;
	}
	public String toString() {
		return "Employee Details:\nId:" + id + "\nName:" + name + "\nSalary:" + salary + "\nDepartment Details:" + dept +"\nDate:"+m;
	}
	
   
}
public class EmployeeInfo {

	public static void main(String[] args) {
		MyDate m=new MyDate(3,"jan",1995);
		MyDate m1=new MyDate(6,"Oct",2003);
		
		Department1 dept=new Department1(1,"HR");
		Department1 dept1=new Department1(2,"Finance");

		Employee1 e=new Employee1(101,"Madhur",45000,dept,m);
        Employee1 e1=new Employee1(102,"Neel",55000,dept1,m1);
        System.out.println(e);
        System.out.println("-------------------------------------------");
        System.out.println(e1);
	}

}
