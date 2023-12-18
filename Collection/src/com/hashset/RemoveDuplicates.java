package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Java");
		al.add("Python");
		al.add("Html");
		
		System.out.println(al);
		
		HashSet<String> hs=new HashSet<>(al);
		System.out.println(hs);
		
			
	}

}
