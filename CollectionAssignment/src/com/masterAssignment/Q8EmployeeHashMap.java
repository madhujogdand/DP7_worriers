package com.masterAssignment;

import java.util.HashMap;

/*8. Create a hashmap where employee is key and string is value.
Employee ( int emp_id , emp_name , emp_salary)
Implement hashcode and equals methd so that map should not allow duplicate entry of 
employees with same salary in the map*/
public class Q8EmployeeHashMap
{
  public static void main (String args[])
  {
	 HashMap <Employee1,String> hm=new HashMap<>();
	 
	 hm.put(new Employee1(101,"Radha",45000f),"Hr");
	 hm.put(new Employee1(102,"Neha",48000f),"Manager");
	 hm.put(new Employee1(103,"Reva",35000f),"TL");
	 hm.put(new Employee1(101,"Radha",45000f),"Hr");
		  
	 System.out.println(hm);
	  
	  
  }
}
