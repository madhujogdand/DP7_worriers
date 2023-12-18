package com.arrayContainment;

import java.util.Scanner;

public class EmployeeGetterSetter {
     static Scanner sc=new Scanner(System.in);
     static void enterDetails(Employee e)
     {
    	 System.out.println("Enter employee id:");
    	 e.setEid(sc.nextInt());
    	 
    	 System.out.println("Enter employee name:");
    	 e.seteName(sc.next());
    
    	 System.out.println("Enter employee salary:");
    	 e.setEid(sc.nextInt());
    	 
    	 e.setDept(new Department());
    	 
    	 System.out.println("Enter Department id:");
    	 e.getDept().setDId(sc.nextInt());
    	 
    	System.out.println("Enter Department name:");
    	 e.getDept().setDName(sc.next());
     }
    static void printDetails(Employee em[])
     {
    	for(Employee e:em)
    	{
    		System.out.println(e);
    	}
     }
	
	public static void main(String[] args) {
		
		
		Employee emp[]=new Employee[2];
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			enterDetails(emp[i]);
		}
		System.out.println("-----------------------------------------------");
		printDetails(emp);
	}

}
