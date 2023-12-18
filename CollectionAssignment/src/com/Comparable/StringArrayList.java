package com.Comparable;
/*1. WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using 
Collections.sort(list) method. Print ArrayList.*/
import java.util.ArrayList;
import java.util.Collections;

public class StringArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("java");
		al.add("python");
		al.add("c");
		al.add("devops");
		al.add(".net");
		
		System.err.println(al);
		System.out.println("==================================");
		Collections.sort(al);
		
		System.out.println(al);

	}

}
