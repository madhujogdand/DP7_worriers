package com.CAArrayList;

/*42. Show use of addfirst , addlast, getfirst, getlast, remove first, 
remove last methods of linked list.
43. Replace an element at specific position in linked list.
44. How do you get last occurance of given element in linked 
list.
*/
import java.util.LinkedList;

public class Q42 {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<String>();

		llist.add("Java");
		llist.add("C++");
		llist.add("C");
		llist.add("Python");
		llist.add("Devops");

		System.out.println(llist);

		llist.addFirst(".net");

		System.out.println(llist);

		llist.addLast("C#");

		System.out.println(llist);
        
		System.out.println("======================================");
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		
		System.out.println("======================================");
		System.out.println(llist.removeFirst());
		System.out.println(llist.removeLast());
		
		System.out.println("======================================");
		//Q43
		
		llist.set(2, "Oracle");
		System.out.println(llist);
		
		System.out.println("======================================");
		//Q44
		

	}

}
