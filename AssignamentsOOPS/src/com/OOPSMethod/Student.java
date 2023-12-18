package com.OOPSMethod;
//1
public class Student {

	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId()//2
	{
		return id;
	}
	void setCustomData(int customId,String customName)//3
	{
		id=customId;
		name=customName;
	}
	void displayData(int newId,String newName)
	{
		System.out.println("Student id:"+id+"\nStudent name:"+name);
		
		int currentId=getId();
		
		this.id=newId;
		this.name=newName;
		
		System.out.println("Student id:"+newId+"\nStudent name:"+newName);
		System.out.println("Previous Id:"+currentId);
		
	}
	
	
	public static void main(String[] args) {
		Student s=new Student(1,"Sanika");
			s.displayData(2,"Shivansh");	
			
		s.setCustomData(3,"Priya");
		//System.out.println("Custom id:"+customId+"Custom name:"+customName);
	}

}
