package com.CASet;

import java.util.TreeSet;

/*54. Create a treeset of 6 strings. Find the index of string given 
by user. */
public class Q54 {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("red");
		ts.add("blue");
		ts.add("black");
		ts.add("pink");
		ts.add("green");
		ts.add("orange");
		
		System.out.println(ts);
	}

}
