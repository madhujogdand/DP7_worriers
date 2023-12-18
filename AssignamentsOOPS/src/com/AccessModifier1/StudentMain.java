package com.AccessModifier1;
//d
import com.AccessModifiers.Student1;

public class StudentMain {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.rNo=1;
		//s.admNo=101;
		//s.age=18;
		//s.cId=20;
		
		//s.show();
		
		s.doPublic();
		//s.doDefault();
		//s.doProtected();
		//s.doPrivate();

	}

}
