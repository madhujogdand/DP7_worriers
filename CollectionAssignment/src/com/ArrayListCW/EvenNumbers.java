package com.ArrayListCW;

/*18.WAP to add 1 to 50 numbers in ArrayList and print only 
 * even numbers (using iterator)*/
import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= 50; i++)
		{
			al.add(i);
		}
		System.out.print("1 to 50 numbers:"+ al+" ");
		System.out.println("==========================================");
		// using Iterator
		System.out.println(" using Iterator: even numbers");
		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			int num = itr.next();
			if (num % 2 == 0)
				System.out.print(num+" ");
		}
		System.out.println("==========================================");
		//using enhanced for loop
		System.out.println("using enhanced for loop");
		for (Integer i : al) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println("===========================================");
		//using for loop
		System.out.println("using for loop");
		for(int i=1;i<al.size();i++)
		{
			if (i % 2 == 0)	
			System.out.print(i+" ");
		}

	}

}

