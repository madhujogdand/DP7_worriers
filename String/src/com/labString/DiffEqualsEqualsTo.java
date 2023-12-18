package com.labString;

public class DiffEqualsEqualsTo {

	public static void main(String[] args) {
		String s1="Python";
		String s2="Python";
		
		System.out.println(s1==s2);//compares reference not value
		System.out.println(s1.equals(s2));//compares content
		
		System.out.println("-----------------------------------------");

		String s3=new String("hi");
		String s4=new String("hi");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		

	}

}
