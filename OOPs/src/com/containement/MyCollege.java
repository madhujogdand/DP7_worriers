package com.containement;

public class MyCollege {

	public static void main(String[] args) {
	 Course c1=new Course(101,"java",23000);
	 Course c2=new Course(102,"python",25000);
	 Course c3=new Course(103,".net",33000);
	 
	 Student s1=new Student(1,"Neha",c1);
	 Student s2=new Student(2,"Radha",c2);
	 Student s3=new Student(3,"Aashu",c3);
	 Student s4=new Student(4,"Pradnya",c3);
	 Student s5=new Student(5,"Pinky",c2);
	 Student s6=new Student(6,"Kiran",c1);
	 
	 System.out.println(s1);
	 System.out.println("--------------");
	 System.out.println(s2);
	 System.out.println("--------------");
	 System.out.println(s3);
	 System.out.println("--------------");
	 System.out.println(s4);
	 System.out.println("--------------");
	 System.out.println(s5);
	 System.out.println("--------------");
	 System.out.println(s6);
	}

}
