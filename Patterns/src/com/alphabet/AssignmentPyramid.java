package com.alphabet;

public class AssignmentPyramid {

	public static void main(String[] args) {
		
			for(char i='A';i<='I';i++)
			{
				for(int j=1;j<=(10-i);j++)
				{
					System.out.print(" ");
				}
			
				for(char j='A';j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}

	}

}
