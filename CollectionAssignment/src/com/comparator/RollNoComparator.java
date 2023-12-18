package com.comparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getRollNo()-o1.getRollNo();
	}

}
