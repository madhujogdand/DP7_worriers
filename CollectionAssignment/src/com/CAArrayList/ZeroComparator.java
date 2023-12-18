package com.CAArrayList;

import java.util.Comparator;

public class ZeroComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return 0;
	}

}
