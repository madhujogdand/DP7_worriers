package com.labArray;

import java.util.Arrays;

public class CharIncrement {

	static char[] charInc(char ch[])
	{
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<='c')
			{
				ch[i]+=2;
			}
			else if(ch[i]>='y')
			{
				ch[i]-=24;
			}
				
		}
		return ch;
	}
	public static void main(String[] args) {
		char arr[]= {'a','b','c','y','z'};
		System.out.println("Before:"+Arrays.toString(arr));
		
		System.out.println("After:"+Arrays.toString(charInc(arr)));
		
	}

}
