package com.CAVector;

import java.util.Vector;

/*100. Create vector using all its constructors.*/
public class Q100 {

	public static void main(String[] args) {
	
		Vector<String> v=new Vector<>();
		v.add("Apple");
		v.add("Kiwi");
		v.add("Banana");
		
		System.out.println(v);
		
		Vector<String> v1=new Vector<>(5);
		v1.add("Apple");
		v1.add("Kiwi");
		v1.add("Banana");
		v1.add("Grapes");
		v1.add("Guava");
	
		System.out.println(v1.size());
		System.out.println(v1);
		
		Vector<String> v2=new Vector<>(5,2);
		v2.add("Apple");
		v2.add("Kiwi");
		v2.add("Banana");
		v2.add("Grapes");
		v2.add("Guava");
		System.out.println(v2.size());
		System.out.println(v2);
		
		v2.add("Mango");
		v2.add("Pear");
		
		System.out.println(v2.size());
		System.out.println(v2);
		
		Vector<String> v3=new Vector<>(v1);
		v3.add("Apple");
		v3.add("Kiwi");
		v3.add("Banana");
		v3.add("Grapes");
		v3.add("Guava");
	
		System.out.println(v3.size());
		System.out.println(v3);
		
		
		
		
	}

}
