package com.CAArrayList;
/*14. Sort arraylist of employees on department names using 
comparator interface. */
import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getDept().getName().compareTo(o2.getDept().getName());
	}

}
