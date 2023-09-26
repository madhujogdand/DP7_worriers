package com.alphabet;

public class LeftAngledDecrease {

	public static void main(String[] args) {
		
		for(char i=5;i>=1;i--)
		{
			//for spaces
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("  ");
			}		
			//for alphabets
			char ch='A';
			for(char j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}


	}

}
