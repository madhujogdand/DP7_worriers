package com.labArray;

public class maxCharArray {
	static char checkMaxChar(char ar[])
	{
		char maxChar='a';//ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>maxChar)
			{
				maxChar=ar[i];
			}
		}
		return maxChar;
	}

	
	public static void main(String[] args) {
		char arr[]={'a','g','c','d'};
		System.out.println("Maxium character of array:"+checkMaxChar(arr));
		

	}

}
