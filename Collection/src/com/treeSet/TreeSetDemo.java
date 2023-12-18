package com.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		
		ts.add("java");
		ts.add("python");
		ts.add("angular");
		//ts.add("null");
		ts.add("java");
		
		System.out.println(ts);

	}

}
