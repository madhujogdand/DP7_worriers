package com.STRING;

public class ReverseOfWords {
	/*24.	Write a Java program to reverse order of 
	words in a given string.*/
	
		static void   reverseWord(String s)
		{
			String splitst[]=s.split("\\s");
			String revst="";
			for(int i=0;i<splitst.length;i++)
			{
				for(int j=splitst[i].length()-1;j>=0;j--)
				{
					revst=revst+splitst[i].charAt(j);
				}
				revst=revst+" ";
			}
			System.out.println("After:"+revst);
		}
		
		public static void main(String[] args) {
			String str="I like to learn java";
			System.out.println("Before:"+str);
	        reverseWord(str);
		}
}
