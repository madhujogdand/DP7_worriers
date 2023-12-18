package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		
		//List<Integer> list1=new ArrayList<nteger>();
		List<Integer> list1=new ArrayList<>();
		
		list1.add(12);
		list1.add(23);
		list1.add(56);
		list1.add(32);
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data=list1.get(i)+10;
			list1.set(i, data);
		}
		System.out.println(list1);
	}

}
