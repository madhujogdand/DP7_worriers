package com.STRING;

public class LastOccOfWord {
	/*35.	Write a Java program to find last occurrence 
    of a word in a given string.*/

	static void checkOccurance(String st)
	{
		String[] s=st.split("\\s");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("First Occurance:"+s[s.length-1]);
			break;
		}
		
	}
	public static void main(String[] args) {
	   String str="Hello world";
	   checkOccurance(str);

	}
}
