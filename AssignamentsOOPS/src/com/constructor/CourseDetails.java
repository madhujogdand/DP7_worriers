package com.constructor;
//9
class SubCourse
{
	int SubCourseid;
	String SubCoursename;
	
	SubCourse()
	{
		System.out.println("SubCourse class Default constructor");
		SubCourseid=2;
		SubCoursename="Pinky";
	}
}
class Course
{
	int id;
	String name;
	SubCourse s;
	
	Course()
	{
		System.out.println("Course class Default constructor");
	    id=1;
	    name="Neha";
	    s=new SubCourse();
	}
}


public class CourseDetails {
	public static void main(String[] args) {
     Course c=new Course();
     System.out.println("Course id:"+c.id+"Course Name:"+c.name);
//     SubCourse s=new SubCourse();
     System.out.println("SubCourse id:"+c.s.SubCourseid+"SubCourse Name:"+c.s.SubCoursename);
	}

}
