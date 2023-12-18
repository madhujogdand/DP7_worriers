package com.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class BookLinkedList {

	public static void main(String[] args) {

		LinkedList<Book> blist = new LinkedList<>();

		blist.add(new Book(1, "C++", 980));
		blist.add(new Book(2, "C", 980));
		blist.add(new Book(3, "Java", 780));
		blist.add(new Book(4, "Html", 880));

		for (Book b : blist)
		{
			System.out.println(b);
		}

		System.out.println("--------------------------------");

		Collections.sort(blist);

		for (Book b : blist)
		{
			System.out.println(b);
		}
		System.out.println("--------------------------------");
		
		Collections.sort(blist,new PriceComparator());

		for (Book b : blist)
		{
			System.out.println(b);
		}
		System.out.println("--------------------------------");
		Collections.sort(blist,new IdComparator());

		for (Book b : blist)
		{
			System.out.println(b);
		}
		System.out.println("--------------------------------");
		Collections.sort(blist,new NameComparator());

		for (Book b : blist)
		{
			System.out.println(b);
		}
	}

}
