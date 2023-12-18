package com.StringAssignments2;

import java.util.Scanner;

public class Frequency {
	/*2.Count frequency of characters
	3. Duplicate characters(Print and count) 
	4. Unique characters*/

	
		static void checkFreq(String s)
		{
			char[] ch=s.toCharArray();
			int count;
			boolean visited;
			for(int i=0;i<ch.length;i++)
			{
				count=1;
				visited=false;
				for(int j=i-1;j>=0;j--)
				{
					if(ch[i]==ch[j])
					{
						visited=true;
						break;
					}
				}
				if(visited==false)
				{
					for(int k=i+1;k<ch.length;k++)
					{
						if(ch[i]==ch[k])
						{
							count++;
						}
					}
					System.out.println(ch[i]+"--->"+count);
				}
				if(count>1)
				{
					System.out.println("Duplicates are:"+ch[i]+"\nCount is:"+count);
				}
				
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        System.out.println("Enter word:");
	        String word=sc.next();
	        checkFreq(word);
		}

}
