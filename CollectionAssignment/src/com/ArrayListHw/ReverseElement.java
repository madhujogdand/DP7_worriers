package com.ArrayListHw;
/*18.WAP to reverse elements in an ArrayList*/
import java.util.ArrayList;

public class ReverseElement {

	public static void main(String[] args) {
	
		ArrayList <Integer> al=new ArrayList<>();
			
			al.add(76);
			al.add(36);
			al.add(89);
			al.add(57);
			al.add(29);
			
			System.out.println(al);
			
			for(int i=0,j=al.size()-1;i<al.size()/2;i++,j--)
			{
					int temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				
			}
			System.out.println(al);
			
			ArrayList<String> list = new ArrayList<>();
			list.add("apple");
			list.add("mango");
			list.add("pinapple");
			list.add("cherry");
			list.add("orange");
			System.out.println(list);
			for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--) {
				String temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
			System.out.println(list);

	}

}
