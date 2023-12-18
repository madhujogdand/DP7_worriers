package com.examples;

import java.util.Scanner;

public class SchoolStaticMethod {
	static Scanner sc=new Scanner(System.in);
	static void enterDetails(Student s)
	{
		System.out.println("Enter student id:");
		
		s.setSid(sc.nextInt());
		
		System.out.println("Enter name:");
		s.setName(sc.next());
		
		System.out.println("Enter marks:");
		s.setMarks(sc.nextFloat());
	}
	static void printDetails(Student str[])
	{
		System.out.println("------------------------------");
		for(Student S:str)
		{
			System.out.println(S);
		}
	}
	public static void main(String[] args) {
		
		
		Student st[]=new Student[3];
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
			enterDetails(st[i]);
		}
       printDetails(st);
		
	sc.close();
	}
     
}
