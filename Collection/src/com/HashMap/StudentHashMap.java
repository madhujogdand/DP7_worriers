package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
	
		HashMap<Integer,Student> shm=new HashMap<>();

		shm.put(101, new Student(101,"Anuj",90));
		shm.put(105, new Student(105,"Neha",88));
		shm.put(107, new Student(107,"shraddha",78));
		shm.put(104, new Student(104,"Radha",90));
		shm.put(104, new Student(104,"Radha",90));//replace the value
		shm.put(106, new Student(106,"Shivani",76));
	
//	    for(Map.Entry<Integer, Student> e: shm.entrySet())
//	    {
//	    	System.out.println("Id:"+e.getKey());
//	    	System.out.println("Details:"+e.getValue());
//	    	System.out.println("-------------------------------------");
//	    }
		
		 for(Map.Entry<Integer, Student> e: shm.entrySet())
		    {
		    	System.out.println("Id:"+e.getKey());
//		    	Student s=e.getValue();
//		    	System.out.println("Details:"+s.getName());
		    	System.out.println("Details:"+e.getValue().getName()+" "+e.getValue().getMarks());
		    	System.out.println("-------------------------------------");
		    }
		 
	}

}
