package com.STRING;

public class ReverseOfString {
	// 23. Write a Java program to find reverse of a string.
	
		static void reverseSt(String s)
		{
			String revst="";
			for(int i=s.length()-1;i>=0;i--)
			{
				revst=revst+s.charAt(i);
			}
			System.out.println("After:"+revst);
		}
		public static void main(String[] args) {
			String str="I like to learn java";
			System.out.println("Before:"+str);
			reverseSt(str);

	}
}
