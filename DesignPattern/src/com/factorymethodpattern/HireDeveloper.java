package com.factorymethodpattern;

import java.util.Scanner;

public class HireDeveloper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the developer to hire(java,python,Fullstack)");
        String dtype=sc.next();
        
        GetDeveloperType gd=new GetDeveloperType();
        Developer d=gd.getDeveloper(dtype);
        if(d==null)
        {
        	System.out.println("Developers not found.....");
        }
        else
        {
        	System.out.println("-----------------------------------");
        	System.out.println("Enter emloyee name:");
        	d.setName(sc.next());
        	
        	System.out.println("=====================================");
        	
        	System.out.println("Welcome to our company..."+d.getName());
        	d.salaryPaid();
        	System.out.println("Salary paid:"+d.salary);
        	d.workingHours();
        	System.out.println("Number of working hours:"+d.noOfHours);
        
        	System.out.println("Skill set:");
        	d.skillset();
        	
        	System.out.println("===========================================");
        }
	}
}
