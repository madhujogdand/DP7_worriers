package com.labString;

import java.util.Arrays;

public class MergeString {

	static void merge(String st1,String st2 )
	{
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
	  char merge[]=new char[ch1.length+ch2.length+1];	
	  int count=0;
	  for(int i=0;i<ch1.length;i++)
	  {
		  merge[count]=ch1[i];
		  count++;
	  }
	  merge[count]=' ';
	  count++;
	  for(int j=0;j<ch2.length;j++)
	  {
		  merge[count]=ch2[j];
		  count++;
	  }
	  
	  System.out.println(merge);
	}
	public static void main(String[] args) {
		String str1="Hello";
		String str2="java";
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
         merge(str1,str2);
       
       
	}

}
