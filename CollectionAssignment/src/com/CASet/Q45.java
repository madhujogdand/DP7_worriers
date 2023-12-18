package com.CASet;

import java.util.HashSet;

/*45. Create hashset by using all constructors of hashset class*/
public class Q45 {

	public static void main(String[] args) {

		// using default constructor

		HashSet<String> hs = new HashSet<String>();

		hs.add("red");
		hs.add("blue");
		hs.add("black");

		System.out.println(hs);

		// constructor with initial capacity
		HashSet<String> hs1 = new HashSet<String>(5);

		hs1.add("pink");
		hs1.add("green");
		hs1.add("orange");
		hs1.add("white");
		hs1.add("gray");

		System.out.println(hs1);

		// constructor with initial capacity and loadfactor
		HashSet<String> hs2 = new HashSet<String>(4, 0.75f);
        hs2.add("peach");
        hs2.add("yellow");
        hs2.add("purple");
        hs2.add("voilet");
        hs2.add("voilet");
		System.out.println(hs2);

		// constructor with initial capacity
		HashSet<String> hs3 = new HashSet<String>(hs1);
		
		System.out.println(hs3);

	}

}
