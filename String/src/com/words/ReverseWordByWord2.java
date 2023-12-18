package com.words;

import java.util.Arrays;

public class ReverseWordByWord2 {

	static void   reverseWord(String s)throws InvalidSentenceException
	{
		String splitst[]=s.split("\\s");
		String revst="";
		
		
			if(splitst.length<2)
			{
				throw new InvalidSentenceException("words shold greater than 2");
			}
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
		try 
		{
		String str="I like to learn java";
		System.out.println("Before:"+str);
        reverseWord(str);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
