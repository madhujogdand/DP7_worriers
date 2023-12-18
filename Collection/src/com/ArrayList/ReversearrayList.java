package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReversearrayList {

	static void reverseList(ArrayList<String>list)
	{
		Iterator<String> itr=list.iterator();
		ListIterator<String> litr=list.listIterator(list.size());
		
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--)
		{
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Mango");
		al.add("Cherry");
		al.add("Banana");
		al.add("Orange");
		al.add("Kiwi");
		
		System.out.println("Before:"+al);
		reverseList(al);
		System.out.println("After:"+al);

	}

}
