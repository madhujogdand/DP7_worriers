package com.masterAssignment;

import java.util.Iterator;
import java.util.TreeSet;

/*9. What will be output of following program.*/
public class Q9MapTest {
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("Jan");
		map.add("Feb");
		map.add("Mar");
		map.add("Apr");
		map.add("May");
		Iterator itr = map.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}

//o/p--->Apr Feb Jan Mar May 