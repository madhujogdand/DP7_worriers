package com.CAArrayList;

import java.util.Comparator;

public class PositiveComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o2.getSalary()-o1.getSalary());
	}

}
