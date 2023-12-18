package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(1, "Neha", 28));
		al.add(new Student(2, "Radha", 29));
		al.add(new Student(3, "Nilam", 27));
		al.add(new Student(4, "Priti", 20));
		al.add(new Student(5, "Harshada", 26));
		al.add(new Student(5, "Harshada", 26));

		for (Student s : al) {
			System.out.println(s);
		}
		System.out.println("=============================================");
		System.out.println("On basis of roll no");
		Collections.sort(al, new RollNoComparator());
		for (Student s : al) {
			System.out.println(s);
		}
		
		System.out.println("=============================================");
		System.out.println("On basis of name");
		Collections.sort(al, new NameComparator());
		for (Student s : al) {
			System.out.println(s);
		}
	
		System.out.println("=============================================");
		System.out.println("On basis of age");
		Collections.sort(al, new AgeComparator());
		for (Student s : al) {
			System.out.println(s);
		}

	}

}
