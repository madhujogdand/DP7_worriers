package com.string;

public class CreateString {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String str1=new String("hello");
		String str2=new String("hello");
		
		System.out.println("---------------------------------");
	
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//using literals
		String s3="hi";
		String s4= new String("hi");
		
		System.out.println("---------------------------------");

		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}

}
