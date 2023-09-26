package com.constructor;

class Student 
{
	private int id;
	private String name;
	private int age;

//student(int sid, String sname, int sage)
//{
//	id=sid;
//	name=sname;
//	age=sage;
//}

//default constructor
Student() 
   {

	}

//parametrized constructor
Student(int id, String name, int age){
	this.id=id;
	this.name=name;
	this.age=age;
}

 public int getId()
	  {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return id + " " + name + " " + age;
	}
}

public class ParamConstructor {

	public static void main(String[] args) {
		// early initialization
       Student s1=new Student(101,"xyz",21); 
       Student s2=new Student(102,"mnp",23); 
       Student s3=new Student(103,"pqr",22); 
       Student s5=new Student(105,"str",26); 
       
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s5);
       
       //lazy initialization
       Student s4=new Student();
       s4.setId(104);
       s4.setName("mno");
       s4.setAge(21);
       System.out.println(s4);
	}
}

