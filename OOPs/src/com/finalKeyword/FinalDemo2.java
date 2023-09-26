package com.finalKeyword;

class Student
{
	String name;
	int rollNo;
	final float fees;
	final String schName;
	
	{
		schName="Gujrati HighSchool";
	}
	Student(String name, int rollNo,float fees)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.fees=fees;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public float setFees()
	{
		return fees;
	}
	
	
}
public class FinalDemo2 {
	public static void main(String[] args) {
		
		Student s=new Student("Madhu",8,25000);
		System.out.println(s.name+" "+s.rollNo);
		
	}

}
