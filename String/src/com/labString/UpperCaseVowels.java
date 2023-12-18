package com.labString;


public class UpperCaseVowels {

	static void checkvowel(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u')
			{
				ch=Character.toUpperCase(ch);
				System.out.println(ch);
			}
			else
			{
				
				System.out.println(ch);
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		String st="madhu";
		System.out.println("Before:"+st);
		checkvowel(st);
		
	}

}
