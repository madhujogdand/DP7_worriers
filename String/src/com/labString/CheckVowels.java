package com.labString;


public class CheckVowels {

	static void checkvowel(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u')
			{
				ch='$';
				System.out.println(ch);
			}
			else
			{
				//ch=ch;
				System.out.println(ch);
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		String st="Hello";
		System.out.println("Before:"+st);
		checkvowel(st);
		
	}

}
