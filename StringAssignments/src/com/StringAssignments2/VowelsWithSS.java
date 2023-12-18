package com.StringAssignments2;

public class VowelsWithSS {
	//5. replace all the vowels with special symbol
	
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
