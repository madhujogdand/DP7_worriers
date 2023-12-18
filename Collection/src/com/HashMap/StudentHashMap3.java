package com.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentHashMap3 {

	public static void main(String[] args) {
	
		HashMap<Student,Course> shm=new HashMap<>();
         
		Course c1=new Course(1,"java",15000);
		Course c2=new Course(2,"Python",12000);
		
		
		shm.put(new Student(101,"Anuj",90),c1);
		shm.put(new Student(105,"Neha",88),c2);
		shm.put(new Student(107,"shraddha",78),c1);
		shm.put(new Student(104,"Radha",90),c2);
		shm.put(new Student(106,"Shivani",76),c1);
	
	    for(Entry<Student, Course> e: shm.entrySet())
	    {
	    	System.out.println("Id:"+e.getKey());
	    	System.out.println("Details:"+e.getValue());
	    	System.out.println("-------------------------------------");
	    }
		
		
	}

}
