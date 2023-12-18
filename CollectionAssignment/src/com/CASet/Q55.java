package com.CASet;

import java.util.HashSet;
import java.util.Iterator;

/*55. Create linked hashset of employee objects. Iterate through it 
using foreach loop and iterator. Observe the order*/
public class Q55 {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();

		hs.add(new Employee(1, "Radha", 45000));
		hs.add(new Employee(2, "Priya", 4000));
		hs.add(new Employee(3, "Snehal", 29000));
		hs.add(new Employee(4, "Aashu", 36000));

		// using for each loop
		for (Employee e : hs) {
			System.out.println(e);
		}
		System.out.println("==========================================");
		// using iterator

		Iterator<Employee> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
