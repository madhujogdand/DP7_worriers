package com.STRING;

public class TotalNumberOfWords {
	/*13.	Write a Java program to count total number of words in a string.*/
	

		static void countWords(String st)
		{
			String s[]=st.split("\\s");
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				count++;
			}
			System.out.println("Word Count is:"+count);
		}
		public static void main(String[] args) {
			String str="Java is programming language";
			countWords(str);
		}
}
