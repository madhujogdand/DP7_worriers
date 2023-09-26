package com.classobject;

public class Student {

	int stid;
	String name;
	float marks;
	
	void display()
	{
		System.out.println(stid+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.stid=1;
		s1.name="Priyanka";
		s1.marks=89f;
		
		Student s2=new Student();
		s2.stid=2;
		s2.name="Sushama";
		s2.marks=83f;
		
		s1.display();
		s2.display();


	}

}
