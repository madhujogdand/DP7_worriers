package com.lab;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<Integer> dlist=new ArrayList<>();
		 dlist.add(5);
		 dlist.add(2);
		 dlist.add(7);
		 dlist.add(4);
		 dlist.add(9);
		 dlist.add(5);
		 dlist.remove((Integer)5);
	     
		 System.out.println(dlist);
	}

}
