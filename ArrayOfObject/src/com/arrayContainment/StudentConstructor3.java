package com.arrayContainment;

import java.util.Arrays;

public class StudentConstructor3 {

	static void countStudentCourseWise(Student st[],Course cour[])
	{
		int count;
		for(Course c:cour)
		{
			count=0;
			for(Student s:st)
			{
				if(s.getCourse().equals(c))
				{
				count++;
				}
			}
		
		System.out.println(c+": "+count);
	}
	
}
	static void infoStudentCourseWIse(Student st[],Course cour[])
	{
		for(Course c:cour)
		{
			System.out.println(c);
			for(Student s:st)
			{
				if(s.getCourse().equals(c))
				{
					System.out.println(s);
					System.out.println(s.getSid()+" "+s.getName());
				}
			}
			System.out.println("----------------------------------------------------");
		}
	}
	public static void main(String[] args) {
		Course co[]=new Course[3];
		co[0]=new Course(101,"java",35000);
		co[1]=new Course(102,".net",38000);
		co[2]=new Course(103,"Python",38000);
		
		
		Student stud[]=new Student[6];
		
		stud[0]=new Student(1,"Priti",co[1]);
		stud[1]=new Student(2,"Shruti",co[2]);
		stud[2]=new Student(3,"Aarya",co[0]);
		stud[4]=new Student(5,"Parth",co[1]);
		stud[5]=new Student(6,"Parth",co[1]);
		
		//hard code getter setter
		
		stud[3]=new Student();
		stud[3].setSid(4);
		stud[3].setName("Shivansh");
		stud[3].setCourse(co[0]);
		
//		for(Student s:stud)
//		{
//			System.out.println(s);
//		}
//		
		//System.out.println(Arrays.toString(stud));
		
		//Total student in each course
		countStudentCourseWise(stud,co);
		System.out.println("======================================================");
		infoStudentCourseWIse(stud,co);
	}

}
