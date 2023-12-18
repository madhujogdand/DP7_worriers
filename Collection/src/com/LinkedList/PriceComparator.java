package com.LinkedList;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		if(b1.getPrice()==b2.getPrice())
		    return b1.getName().compareTo(null);
		else
			return(int)(b2.getPrice()-b1.getPrice());
	}

}
