package com.MapHw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*10.WAP to create a map which stores an arraylist as a value
 * 11.WAP to iterate the elements in the arraylist stored in the above Map.*/
public class HashMapStoresArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(45);
		al.add(55);
		al.add(65);
		al.add(45);
		al.add(35);
		
		Iterator<Integer> itr=al.iterator();//11
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		HashMap<String,ArrayList<Integer>> hm=new HashMap<>();
		hm.put("Neha", al);//10
		hm.put("Radha", al);
		hm.put("Priti", al);
		hm.put("Puja", al);
		hm.put("Palak", al);
		
		System.out.println(hm);
		
		
			

	}

}
