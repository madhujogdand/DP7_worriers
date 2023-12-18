package com.ArrayListHw;

import java.util.ArrayList;

/*11.WAP to clone an ArrayList to another ArrayList*/
public class CloneArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();

		al.add(67);
		al.add(56);
		al.add(87);
		al.add(34);
		al.add(65);

		System.out.println(al);
		ArrayList<Integer> al1 = new ArrayList<>();
		
		for(int i=0;i<al.size();i++)
		{
			al1.add(al.get(i));
		}
		System.out.println(al1);
		ArrayList<String> al2 = new ArrayList<>();

		al2.add("Neha");
		al2.add("Harshada");
		al2.add("Parul");
		al2.add("Nabha");
		al2.add("Sakhi");

		System.out.println(al2);
		ArrayList<String> al3 = new ArrayList<>();
		
		for(int i=0;i<al2.size();i++)
		{
			al3.add(al2.get(i));
		}
		System.out.println(al3);
	}

}
