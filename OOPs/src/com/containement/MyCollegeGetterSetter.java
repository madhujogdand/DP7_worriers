package com.containement;

public class MyCollegeGetterSetter {
	
public static void main(String[] args) {
	

	Course c1=new Course();
	c1.setId(101);
	c1.setCname("Full Stack");
	c1.setFees(65000);
	
	Student s1=new Student();
	s1.setId(1);
	s1.setName("Madhu");
	s1.setCourse(c1);
		
	System.out.println(s1);
	
	Student s2=new Student();
	s2.setId(2);
	s2.setName("Aaradhya");
	s2.setCourse(new Course());
	s2.getCourse().setId(102);
	s2.getCourse().setCname("java");
	s2.getCourse().setFees(67450);
	
	System.out.println(s2);
	
}
}