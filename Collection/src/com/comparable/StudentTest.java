package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
	
		ArrayList<Student> slist=new ArrayList<>();
		
		slist.add(new Student(101,"Madhu",78.5f));
		slist.add(new Student(108,"Radha",89.5f));
		slist.add(new Student(107,"Radha",89.5f));
		slist.add(new Student(103,"Neha",89.5f));
		slist.add(new Student(104,"Priti",89.4f));
		slist.add(new Student(105,"Aashu",99.4f));
		slist.add(new Student(106,"Reva",83.6f));
		
	//	System.out.println(slist);
		for(Student s:slist)
		{
			//System.out.println(s.getName()+" "+s.getmarks);
		   System.out.println(s);
		}
		
		System.out.println("-----------------------------------------------------");
		
		Collections.sort(slist);
		
		for(Student s:slist)
		{
			
		   System.out.println(s);
		}

		
		

	}

}
