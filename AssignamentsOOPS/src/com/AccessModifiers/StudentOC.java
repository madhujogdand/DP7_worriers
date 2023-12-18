package com.AccessModifiers;
//a
class Student
{
public int rNo;
protected int admNo;
int age;
private int cId;

void show()
{
	System.out.println("Roll no:"+rNo);
	System.out.println("Admission no:"+admNo);
	System.out.println("Age:"+age);
	System.out.println("Course Id:"+cId);
}

public void doPublic()
{
	System.out.println("Public method");
}
void doDefault()
{
	System.out.println("default method");
}
protected void doProtected()
{
	System.out.println("Protected method");
}
private void doPrivate()
{
	System.out.println("Private method");
}
}
//b
class TQPPStudent extends Student
{
	void checkStudentVariableAccess()
	{
		System.out.println("Roll no:"+rNo);
		System.out.println("Admission no:"+admNo);
		System.out.println("Age:"+age);
		//System.out.println("Course Id:"+cId);
		//Private members accesible within the class
	}
	void checkStudentMethodAccess()
	{
		doPublic();
		doDefault();
		doProtected();
		//doPrivate();
	}
}
public class StudentOC {
	

	public static void main(String[] args) {
		
		Student s=new Student();
		s.rNo=1;
		s.admNo=101;
		s.age=18;
		//s.cId=20;
		s.show();
		s.doPublic();
		s.doDefault();
		s.doProtected();
		//s.doPrivate();
		
        System.out.println();
        
        TQPPStudent t=new TQPPStudent();
        t.rNo=2;
		t.admNo=102;
		t.age=20;
		//t.cId=21;
        t.checkStudentVariableAccess();
        t.checkStudentMethodAccess();
	}

}
