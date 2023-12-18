package com.Queue;

import java.util.PriorityQueue;

import com.LinkedList.Book;

public class BookPriorityQueue {

	public static void main(String[] args) {
	
		//PriorityQueue<Book> bookpq=new PriorityQueue<>(new PriceComparator());
		PriorityQueue<Book> bookpq=new PriorityQueue<>();

		bookpq.add(new Book(1,"C++",980));
		bookpq.add(new Book(2,"C",980));
		bookpq.add(new Book(2,"Java",780));
		bookpq.add(new Book(4,"Html",880));
		
		for(Book b: bookpq)
		{
			System.out.println(b);
		}
		
	}

}
