package com.treeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class SortByPriceUsingHashSet {

	public static void main(String[] args) {
		HashSet<Book> hs=new HashSet<Book>();
		
		hs.add(new Book(101,"Pendrive",890f));
		hs.add(new Book(102,"Charger",300f));
		hs.add(new Book(103,"Laptop",45000f));
		hs.add(new Book(104,"Computer",35000f));
		hs.add(new Book(101,"Pendrive",890f));
		
		System.out.println(hs);
		
		TreeSet<Book> ts=new TreeSet<Book>();
		
		ts.addAll(hs);
		for(Book b:ts)
		{
			System.out.println(b);
		}

	}

}
