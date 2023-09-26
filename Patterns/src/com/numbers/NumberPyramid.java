package com.numbers;
public class NumberPyramid {
	public static void main(String[] args) {
		int number=1;
		for(int i=1;i<=4;i++)
		{
			//for spaces
			for(int j=1;j<=(4-i);j++)
			{
				System.out.print(" ");
			}
			//for numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}
