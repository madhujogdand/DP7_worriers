package com.ArrayListPractice;
/*Q5. Create a non generic arraylist and show the 
 * usage of creating generics*/
import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
     List<Integer> list1=new ArrayList<>();
		
		list1.add(12);
		list1.add(31);
		list1.add(78);
		list1.add(65);
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data=list1.get(i)+10;
			list1.set(i, data);
		}
		System.out.println();
	}


	

}
