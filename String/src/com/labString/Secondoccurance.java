package com.labString;

import java.util.Scanner;

public class Secondoccurance {

	static void checkLetter(String st)
	{
		int count=0;
		int i;
		
		for( i=0;i<st.length();i++)
		{
		    if(st.charAt(i)=='a')
		    {
		    	count++;
		    	
		    }
		    if(count==2)
		    {
		    	break;
		    }
		}
		System.out.println("Index of second occurance:"+i);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  System.out.println("Enter String:");
	  String str=sc.next();
	   checkLetter(str);
      sc.close();
	}

}
