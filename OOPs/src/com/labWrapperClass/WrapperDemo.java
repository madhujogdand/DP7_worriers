package com.labWrapperClass;

public class WrapperDemo {

	public static void main(String[] args) {
	  
		int num=10;
		Integer k=45;
		Integer i=Integer.valueOf(num);
		
		System.out.println(k+" "+i);
		
		String s="123";
		String t=String.valueOf(s);
		System.out.println(t);
		
		char c='A';
		Character ch=Character.valueOf(c);
		System.out.println(ch);
		
		
		int g=Integer.parseInt(s)+10;
		System.out.println(g);
		
		char c1='B';
		Integer r=Integer.valueOf(c1);
		System.out.println(r);
		
		
		
	}

}
