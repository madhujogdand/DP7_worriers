package com.arrayContainment;

import java.util.Arrays;

public class StudentConstructor {

	public static void main(String[] args) {
		Course c1=new Course(101,"java",35000);
		Course c2=new Course(102,".net",38000);
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(1,"Priti",c1);
		stud[1]=new Student(2,"Shruti",c2);
		stud[2]=new Student(3,"Aarya",c1);
		//stud[3]=new Student(4,"Parth",c2);
		
		//hard code getter setter
		
		stud[3]=new Student();
		stud[3].setSid(4);
		stud[3].setName("Shivansh");
		stud[3].setCourse(c1);
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(stud));
	}

}
