package com.AccessModifier1;

import com.AccessModifiers.Student1;

//c


class OtherPackageStudent extends Student1
{
	
	void checkStudentVariableAccess()
	{
		System.out.println("Roll no:"+rNo);
		System.out.println("Admission no:"+admNo);
		//System.out.println("Age:"+age);//default
		//System.out.println("Course Id:"+cId);//private
	}
	void checkStudentMethodAccess()
	{
		doPublic();
		//doDefault();
		doProtected();
		//doPrivate();
	}
}
public class OtherPackageStudent1 {
	
	public static void main(String[] args) {
		OtherPackageStudent  o=new OtherPackageStudent();
	        o.rNo=2;
			//o.admNo=102;
			//o.age=20;
			//o.cId=21;
	        o.checkStudentVariableAccess();
	        o.checkStudentMethodAccess();

	}

}

