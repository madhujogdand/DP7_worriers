package com.words;

import java.util.Arrays;

public class DivideStringNotWqual {

	static void divideString(String st,int noOfc)
	{
		int len=st.length();//12
		//noofchar:5
		//number of subString
		
		if(len%noOfc!=0)
		{
			//remaindet:extra characters
			int x=noOfc-(len%noOfc);
			for(int i=0;i<x;i++)
			{
				st=st.concat("#");
			}
		}
		
			int n=st.length()/noOfc;
		String spltstr[]=new String[n];
		int index=0;
		
		for(int i=0;i<st.length();i+=noOfc)
		{
			spltstr[index]=st.substring(i,i+noOfc);
			index++;
		}
		System.out.println(Arrays.toString(spltstr));
	}
	
	public static void main(String[] args) {
		String arr[]= {"I","am","very","smart"};
        String s1=String.join("", arr);
        System.out.println(s1);
        int noOfChars=5;
        divideString(s1,noOfChars);
	}

}
