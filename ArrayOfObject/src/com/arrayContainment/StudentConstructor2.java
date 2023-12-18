package com.arrayContainment;

import java.util.Arrays;

public class StudentConstructor2 {

	public static void main(String[] args) {
		Student stud[]=new Student[4];
		
		stud[0]=new Student(1,"Priti",new Course(101,"java",35000));
		stud[1]=new Student(2,"Shruti",new Course(102,".net",38000));
		stud[2]=new Student(3,"Aarya",new Course(102,".net",38000));
		//stud[3]=new Student(4,"Parth",c2);
		
		//hard code getter setter
		
		stud[3]=new Student();
		stud[3].setSid(4);
		stud[3].setName("Shivansh");
		stud[3].setCourse(new Course(101,"java",35000));
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(stud));
	}

}
