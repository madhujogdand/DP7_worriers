package com.ArrayListHw;

import java.util.ArrayList;

public class PositionOfArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(45);
		al.add(28);
		al.add(39);
		al.add(49);
		al.add(93);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Element:"+al.get(i)+"Position:"+i);
		}
		System.out.println("49:"+al.indexOf(49));

	}

}
