package com.treemap;

import java.util.Comparator;

public class MnoComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return (int) (o2.getMno()-o1.getMno());
	}


	

	

}
