package com.example2;

public class StudentTest {

	public static void main(String[] args) {
		Student st[]=new Student[3];
		float m[]= {67.4f,88.5f,90.3f};
		st[0]=new Student(101,"Riha",m);
		
		float m1[]= {55.4f,79.3f,93.3f};
		st[1]=new Student(102,"Priti",m1);

		float m2[]= {78.4f,58.6f,78.3f};
		st[2]=new Student();
		st[2].setId(103);
		st[2].setName("Nill");
		st[2].setMarks(m2);
		//st[2]=new Student(103,"Rishi",m2);
         
		System.out.println("---------------------------------");

		for(Student s:st)
		{
			System.out.println(s);
		}
	}

}
