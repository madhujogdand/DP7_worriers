package com.STRING;

public class AllOccuranceOfChar {
	/*15.	Write a Java program to search all occurrences 
	 * of a character in given string.*/
	

		
			static void checkAllOccurance(String st)
			{
				char ch[]=st.toCharArray();
				for(int i=0;i<ch.length;i++)
				{
					System.out.println("All Occurances of Char:"+ch[i]);
					
				}
				
			}
			public static void main(String[] args) {
			   String str="Hello";
			   checkAllOccurance(str);

			}


}
