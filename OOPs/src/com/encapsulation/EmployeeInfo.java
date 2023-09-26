package com.encapsulation;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee e1=new Employee();
	
		e1.setEmpId(101);
	    e1.setEmpName("Madhu");
	    e1.setDesignation("Java Developer");
	    e1.setSalary(25000);
	    
	    System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDesignation()+" "+e1.getSalary());
	    System.out.println(e1);
		}

	}


