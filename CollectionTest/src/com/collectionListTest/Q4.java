package com.collectionListTest;

import java.util.Iterator;
import java.util.LinkedList;

/*4.WAP to create a LinkedList<Emp> and search for 
 * Emp object whose eno=10 and delete all the 
 * records whose dept is same as  eno 10.
 * Emp(int id, String name Dept d) [2M]*/
public class Q4 {

	public static void main(String[] args) {
		LinkedList<Emp> ls=new LinkedList<Emp>();
		
		ls.add(new Emp(5,"Radha",new Dept(101,"Finance")));
		ls.add(new Emp(6,"Neha",new Dept(102,"Hr")));
		ls.add(new Emp(7,"Shraddha",new Dept(103,"Marketing")));
		ls.add(new Emp(8,"Shivani",new Dept(104,"Hr")));
		ls.add(new Emp(9,"Shruti",new Dept(105,"Finance")));
		ls.add(new Emp(10,"Priti",new Dept(106,"Finance")));

		System.out.println(ls);
		System.out.println("=====================================================================");
		for(Emp e:ls)
		{
			System.out.println(e);
		}
		
		System.out.println("=====================================================================");
		
		Iterator<Emp> itr=ls.iterator();
		while(itr.hasNext())
		{
			Emp emp=itr.next();
			if(emp.getId()==10)
				itr.remove();
		}
		
		System.out.println("=====================================================================");
		for(Emp e:ls)
		{
			System.out.println(e);
		}
	}

}
