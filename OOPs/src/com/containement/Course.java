package com.containement;

public class Course {

	private int id;
	private String cname;
	private int fees;

	Course()
	{
		
	}
	Course(int id, String cname, int fees)
	{
		this.id=id;
		this.cname=cname;
		this.fees=fees;
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	public int getFees()
	{
		return fees;
	}
	public void setFees(int fees)
	{
		this.fees=fees;
	}
	public String toString()
	{
		return "Course id:"+id+"\nCourse name:"+cname+"\nFees:"+fees;
	}
}


