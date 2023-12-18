package com.ArrayList;

import java.util.ArrayList;

public class MethodsArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		System.out.println();
		al.add("java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("java");
		al.add(null);
		al.add(null);
		System.out.println();
		System.out.println(al);

		// difference set and add

		al.add(2, "HTML");
		System.out.println(al);// add and shift

		al.set(5, "Devops");
		System.out.println(al);// replaces
		ArrayList<String> al2 = new ArrayList<>(5);
		al2.add(".net");
		al2.add("SQL");
		System.out.println(al2);
		ArrayList<String> al3 = new ArrayList<>(5);
		al2.add(".net");
		al2.add("SQL");
		al.add("java");
		al.add("React");
		System.out.println(al2);

//		al.addAll(al2);
//		System.out.println(al);

		al.addAll(2, al2);
		System.out.println(al);

		System.out.println(al.contains("java"));
		System.out.println(al.contains("React"));

		System.out.println(al.containsAll(al3));// all elements of al3 must be present in al

		System.out.println(al.size());

		// remove

		System.out.println(al.remove(4));// return Element
		System.out.println(al.remove("HTML"));
//		System.out.println(al.remove("java"));//return boolean
//		
//		
//		al.removeall(al3);//remove all elements which matches al3
//		System.out.println(al3);
//		
		al.retainAll(al3);// keeps only those elements which matches al3 and remomve rest
		System.out.println(al);

	}

}
