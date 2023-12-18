package com.CAMap;
/*79. Create treemap using treemap(comparator) constructor. 
Create name comparater of employee class and pass it to 
constructor. */
import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
