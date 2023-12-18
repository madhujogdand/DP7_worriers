package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

/*Q5. Create a non generic arraylist and show the 
 * usage of creating generics*/
public class NonGenericArrayListUsage {

	public static void main(String[] args) {
		List list1=new ArrayList<>();
		
		list1.add(12);
		list1.add("Madhu");
		list1.add(34.5f);
		list1.add('N');
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data=(int)list1.get(i)+10;
			list1.set(i, data);
		}
		System.out.println();
	}

}
