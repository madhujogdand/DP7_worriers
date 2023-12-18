package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<>();
		
		elist.add(new Employee(1,"Maya",34000));
		elist.add(new Employee(2,"Radha",44000));
		elist.add(new Employee(3,"Neha",44000));
		elist.add(new Employee(4,"Priti",56000));
		elist.add(new Employee(5,"Shruti",64000));
		elist.add(new Employee(6,"Aashu",36000));
		
		
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		
		
		Collections.sort(elist,Collections.reverseOrder());
		System.out.println("-----------------------------------------");
		
		for(Employee e:elist)
		{
			System.out.println(e);
		}

	}

}
