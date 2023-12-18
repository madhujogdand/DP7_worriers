package com.ArrayListCW;

import java.util.ArrayList;

/*22.	WAP of swap two elements in an ArrayList*/
public class SwapArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		
		System.out.println(al);
		
		int temp=al.get(2);
		al.set(2,al.get(4));
		al.set(4,temp);
		
		System.out.println(al);
	}

}

