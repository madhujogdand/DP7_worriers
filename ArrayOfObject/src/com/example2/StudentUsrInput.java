package com.example2;

import java.util.Scanner;

public class StudentUsrInput {

	static Scanner sc=new Scanner(System.in);
	
	static void enterDetails(Student s)
	{
		System.out.println("Enter Student id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter student name:");
		s.setName(sc.next());
		
		float m[]=new float[5];
		System.out.println("Enter student marks of 5 subject:");
	
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Subject:"+(i+1)+":");
			m[i]=sc.nextFloat();
		}
		s.setMarks(m);
	}
	static float calPercentage(Student s)
	{
		float m[]=s.getMarks();
		float total=0;
		for(float m1:m)
		{
			total+=m1;
		}
		float per=(total/500)*100;
		return per;
	}
	
	public static void main(String[] args) {
		Student stud[]=new Student[3];
		for(int i=0;i<stud.length;i++)
		{
			stud[i]=new Student();
			enterDetails(stud[i]);
			
		}
       System.out.println("--------------------------------------");
	   for(Student s:stud)
	   {
		   System.out.println(s.getId()+" "+s.getName()+" "+calPercentage(s));
	   }
	}

}
