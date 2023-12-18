package com.ArrayListPractice;

import java.util.ArrayList;

/*Q3. Create an arraylist of Integer and implement following methods
    1. get method
    2. set method
    3. retainAll
    4. removeAll
    5. add method*/
public class MethodsIntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(67);
		al.add(34);
		al.add(22);
		al.add(56);
		al.add(45);
		al.add(null);

		System.out.println("al:" + al);
		System.out.println("===========================================");

        System.out.println("Size:"+al.size());
		System.out.println("===========================================");

		// add method
		System.out.println("Add method");
		al.add(1, 21);
		System.out.println("After adding:" + al);
		al.add(1, 21);
		System.out.println("After adding:" + al);

		System.out.println("===========================================");

		// new arraylist added
		System.out.println("New arraylist added");
		ArrayList<Integer> al1 = new ArrayList<>(6);
		al1.add(89);
		al1.add(42);
		al1.add(67);
		System.out.println("al1:" + al1);

		System.out.println("===========================================");

		// set method
		System.out.println("Set method");
		al.set(1, 22);
		System.out.println("After Setting:" + al);
		al.set(1, 23);
		System.out.println("After Setting:" + al);

		System.out.println("===========================================");

		// get method
		System.out.println("Get method");
		System.out.println(al.get(6));
		System.out.println("-------------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("===========================================");

		//contains
		System.out.println("Contains:");
	    System.out.println(al.contains(42));
	    System.out.println("--------------");
	    System.out.println(al.containsAll(al1));
			
	    System.out.println("===========================================");

		// remove all
	    System.out.println(" remove all");
		System.out.println(al1.remove(1));
		System.out.println("After removing al1:" + al1);
		al.removeAll(al1);
		System.out.println("After removing all al:" + al);

		System.out.println("===========================================");
		// retain all
		System.out.println("retain all");
		al.retainAll(al1);
		System.out.println(al);
		System.out.println("After retainig al:" + al);

		
	}

}
