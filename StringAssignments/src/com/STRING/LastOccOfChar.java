package com.STRING;

public class LastOccOfChar {
	/*25.	Write a Java program to find last occurrence 
    of a character in a given string.*/


	static void checkOccurance(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("First Occurance:"+ch[ch.length-1]);
			break;
		}
		
	}
	public static void main(String[] args) {
	   String str="Hello";
	   checkOccurance(str);

	}
}
