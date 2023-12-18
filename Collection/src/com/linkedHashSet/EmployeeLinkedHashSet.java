package com.linkedHashSet;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Employee> hs=new LinkedHashSet<>();
		
		hs.add(new Employee(101,"Neha",9000));
		hs.add(new Employee(102,"Radha",9800));
		hs.add(new Employee(103,"Aashu",7000));
		hs.add(new Employee(103,"Aashu",7000));
		
		//overide equals and hashcode
		
		for(Employee e:hs)
		{
			System.out.println(e);
		}

	}

}
