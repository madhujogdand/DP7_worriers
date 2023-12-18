package com.arrayContainment;

import java.util.Scanner;

public class StudentGetterSertter {

	static Scanner sc = new Scanner(System.in);

	static void enterDetails(Student s) {
		System.out.println("Enter student id:");
		s.setSid(sc.nextInt());

		System.out.println("Enter student name:");
		s.setName(sc.next());

		// 1st way
		//Course c = new Course();

//		System.out.println("Enter course id:");
//		c.setId(sc.nextInt());
//		
//		System.out.println("Enter course name:");
//		c.setName(sc.next());
//		
//		System.out.println("Enter course fees:");
//		c.setFees(sc.nextFloat());

		// 2nd way:Annonyms object

		s.setCourse(new Course());
		System.out.println("Enter course id:");
		s.getCourse().setId(sc.nextInt());

		System.out.println("Enter course name:");
		s.getCourse().setName(sc.next());

		System.out.println("Enter course fees:");
		s.getCourse().setFees(sc.nextFloat());

	}
    static void printDetails(Student s[])
    {
    	for(Student st:s)
    	{
    		System.out.println(st);
    	}
    }
	public static void main(String[] args) {
		Student stud[] = new Student[3];
		
		for(int i=0;i<stud.length;i++)
		{
			stud[i]=new Student();
			enterDetails(stud[i]);
		}
        System.out.println("--------------------------------------------");
	        printDetails(stud);
	}

}
