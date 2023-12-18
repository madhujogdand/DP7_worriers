package com.sorting;

import java.util.Comparator;

import com.HashMap.Student;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getMarks()-o1.getMarks();
	}

}
