package com.labCodes;

public class PatternAlphabet {

	public static void main(String[] args) {
		      char ch='A';
		      
		      //for rows
			for(char i=1;i<=6;i++)
			{
				//for alphabets
				for(char j=1;j<=i;j++)
				{
					System.out.print(ch+" ");
					ch++;
				}
				System.out.println();
			}

	}

}
