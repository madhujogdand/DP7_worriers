package com.STRING;

public class CountOccOfChar {
	/*11.	Write a Java program to count occurrences 
	 * of a character in given string.*/
	

		static void checkCount(String st)
		{
			char ch[]=st.toCharArray();
			int count=1;
			//boolean visited;
			int i;
			for(i=0;i<ch.length;i++)
			{
				//count=1;
				//visited=false;
				
				count++;
				
			}
			System.out.println("count Occurance:"+ch[i]+count);
		}
		public static void main(String[] args) {
		   String str="Hello";
		   checkCount(str);

		}
}
