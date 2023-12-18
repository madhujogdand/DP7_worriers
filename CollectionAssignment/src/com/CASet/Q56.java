package com.CASet;

import java.util.HashSet;
import java.util.TreeSet;

/*56. Create treeset using constructor which accepts comparater 
as input argument.*/
public class Q56 {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>(new NameComparator());

		ts.add(new Employee(1, "Radha", 45000));
		ts.add(new Employee(2, "Priya", 4000));
		ts.add(new Employee(3, "Snehal", 29000));
		ts.add(new Employee(4, "Aashu", 36000));

		// using for each loop
		for (Employee e : ts) {
			System.out.println(e);
		}
	}

}
