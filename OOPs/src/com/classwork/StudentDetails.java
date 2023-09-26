package com.classwork;

class Student
{
	private int id;
	private String name;
	protected int monthlyfees;

	
	Student()
	{
		
	}
	Student(int id,String name,int monthlyfees)
	{
		this.id=id;
		this.name=name;
		this.monthlyfees=monthlyfees;
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
//	public int getMonthlyfees()
//	{
//		return monthlyfees;
//	}
//	public void setMonthlyfees(int monthlyfees)
//	{
//		this.monthlyfees=monthlyfees;
//	}
	public String toString()
	{
		return "Student Details: \nStudent id:"+id+"Student name:"+name;
	}
	void payfees()
	{
		System.out.println("Your fees is calculated on monthly basis, monthly fees to be paid:"+monthlyfees);
	}
}
class CollegeStudent extends Student
{
	private int semNo;
	private String clgName;
	
	CollegeStudent()
	{
		
	}
	
	CollegeStudent(int id, String name, int fees,int semNo,String clgName)
	{
		super(id,name,fees);
		this.semNo=semNo;
		this.clgName=clgName;
		
	}
	public int getSemNo()
	{
		return semNo;
	}
	public void setSemNo(int semNo)
	{
		this.semNo=semNo;
	}
	public String getClgName()
	{
		return clgName;
	}
	public void setClgName(String clgName)
	{
		this.clgName=clgName;
	}
	
	public String toString()
	{
		return "College Student Details: \nSem number:"+semNo+"\nCollege Name:"+clgName;
	}
	
	void payfees()
	{
		System.out.println("College Student half yearly fees is"+(monthlyfees*6));
		
	}
}

class SchoolStudent extends Student
{
	private int std;
	private String schName;
	
	SchoolStudent()
	{
		
	}
	SchoolStudent(int id,String name,int fees,int std,String schName)
	{
		super(id,name,fees);
		this.std=std;
		this.schName=schName;
		
	}

	public int getStd()
	{
		return std;
	}
	public void setStd(int std)
	{
		this.std=std;
	}
	public String getSchName()
	{
		return schName;
	}
	public void setSchName(String schName)
	{
		this.schName=schName;
	}
	public String toString()
	{
		return "School Student Details: \nStandard:"+std+"School Name:"+schName;
	}
	
	void payfees()
	{
		System.out.println("School Student quaterly fees is"+(monthlyfees*3));
		
	}

}

public class StudentDetails {

	public static void main(String[] args) {
		Student s;
		s=new Student(101,"madhu",3000);
		System.out.println(s.getName()+":");
		s.payfees();
		
		s=new SchoolStudent(102,"Madhu",4000,12,"GH");
		System.out.println(s.getName()+":"); 
	    s.payfees();
				
	    s=new CollegeStudent(103,"Priyanks",6000,3,"ITM");
	    System.out.println(s.getName()+":");
	    s.payfees();
		
	}
}
