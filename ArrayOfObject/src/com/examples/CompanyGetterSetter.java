package com.examples;

import java.util.Scanner;

public class CompanyGetterSetter {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
      Employee emp[]=new Employee[3];
      for(int i=0;i<emp.length;i++)
      {
    	  emp[i]=new Employee();
    	  System.out.println("Enter Employee id:");
    	  emp[i].seteId(sc.nextInt());
    	  
    	  System.out.println("Enter Employee name:");
    	  emp[i].setName(sc.next());
    	  
    	  System.out.println("Enter Employee salary:");
    	  emp[i].setSalary(sc.nextInt());
      }
      System.out.println("------------------------------------");
      for(Employee e:emp)
      {
    	  System.out.println(e);
      }
      sc.close();
	}

}
