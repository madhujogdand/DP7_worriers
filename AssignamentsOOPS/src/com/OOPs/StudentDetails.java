package com.OOPs;

class Student
{
	int id;
	String name;
	
	Student()
	{
		
	}
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
	}
	
}
public class StudentDetails {

	public static void main(String[] args) {
		Student s=new Student(101,"Shiv");
		s.display();
		//System.out.println(s);
		Student s1=new Student(102,"Aarya");
       s1.display();
       System.out.println();
       
       Student s3=s1;
       System.out.println(s3);
       Student s4=s1;
       System.out.println(s4);
       
       
	}

}
