package com.customException;

import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private float marks;

	public Student() {
		super();

	}

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	void calPercentage(float marks)
	{
		//Scanner sc = new Scanner(System.in);
		
//		for (int i = 0; i < 5; i++)
//		{
//			System.out.println("Enter marks:");
//			float marks = sc.nextFloat();
//		}
		try
		{
			int total=0;
			int per;
			total+=marks; 
			 if(this.marks<0)
			{
              throw new InvalidMarksEXception("Invalid marks entered");
			}
			System.out.println("sum:"+total);
			per=(total/500)*100;
			System.out.println("Average of 5 subject:"+per);
		} catch (InvalidMarksEXception e)
		{
			System.out.println(e);
		}
	}

}

public class StudentDetails {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setId(1);
		s1.setName("Madhu");
		s1.setMarks(56);
		s1.setMarks(89);
		s1.setMarks(-99);
		s1.setMarks(80);
		s1.setMarks(90);
		
		
	}

}
