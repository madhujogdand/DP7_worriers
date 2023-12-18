package com.labString;

public class StringImmutable {

	public static void main(String[] args) {
		String s1="Radha";
		System.out.println(s1.hashCode());
//		System.out.println(s1);
		System.out.println("=================================");
		s1="Priya";
		System.out.println(s1.hashCode());
		System.out.println(s1);
		System.out.println("=================================");
		String s2=new String("Pranjal");
		System.out.println(s2.hashCode());
		System.out.println(s2);
		


	}

}
