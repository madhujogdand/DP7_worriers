package com.dynamicMethodDispatch;

class Student
{
	String name="Shivansh";
	
	void show()
	{
		System.out.println(name+" is a student");
	}

}
class SchoolStudent extends Student
{
	String sname="GH";
	 void show()
	{
		super.show();
		System.out.println("My school name is "+sname);
	}
	
	void display()
	{
		System.out.println("This school is in nanded");
	}
}
public class DMDDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		
		System.out.println();
		
		SchoolStudent st=new SchoolStudent();
		st.show();
		st.display();
		
		System.out.println();
		
        Student s1;
        s1=new Student();
        s1.show();
        
        System.out.println();
        
        s1=new SchoolStudent();
        s1.show();
       // s1.display();
        
	}

}
 