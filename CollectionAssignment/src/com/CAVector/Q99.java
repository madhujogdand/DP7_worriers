package com.CAVector;

import java.util.Iterator;
import java.util.Vector;

/*99. Create vector of employee objects. Delete employee object if 
salary of employee is < 5000*/
public class Q99 {

	public static void main(String[] args) {

		Vector<Employee> v = new Vector<Employee>();

		v.add(new Employee(1, "Neel", 5800));
		v.add(new Employee(2, "priti", 4800));
		v.add(new Employee(3, "Sneha", 6800));
		v.add(new Employee(4, "Dhruti", 3800));
		v.add(new Employee(5, "Radha", 5400));

		System.out.println(v);

		System.out.println("================================================================");

		for (Employee e : v) {
			System.out.println(e);
		}

		Iterator<Employee> itr = v.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getSalary() < 5000)
				itr.remove();
		}
		System.out.println("================================================================");

		for (Employee e : v) {
			System.out.println(e);
		}
	}

}
