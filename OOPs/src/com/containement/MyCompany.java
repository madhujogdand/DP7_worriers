package com.containement;

public class MyCompany {

	public static void main(String[] args) {
		Department d1=new Department(1,"Hr");
	    Department d2=new Department(2,"Finance");
	    Department d3=new Department(3,"Marketing");
	    Department d4=new Department(4,"IT");
		   
	   Employee e1=new Employee(101,"Shivansh",d1);
	   Employee e2=new Employee(102,"Dhruti",d2);
	   Employee e3=new Employee(103,"Aarya",d3);
	   Employee e4=new Employee(104,"Dhara",d4);
	  
	   
	   System.out.println(e1);
	   System.out.println("-----------------------");
	   
	   System.out.println(e2);
	   System.out.println("-----------------------");
	   
	   System.out.println(e3);
	   System.out.println("-----------------------");
	   
	   System.out.println(e4);
	   System.out.println("-----------------------");
	   
	   
	   
	}

}
