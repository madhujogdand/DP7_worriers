package com.CAArrayList;

import java.util.ArrayList;

/*11. Insert more than one element at particular position in 
arraylist.*/
public class Q11 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println(al);

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		al1.add(15);
		al1.add(16);
		al1.add(17);
		System.out.println(al1);

		al.addAll(1, al1);

		System.out.println(al);
	}

}
