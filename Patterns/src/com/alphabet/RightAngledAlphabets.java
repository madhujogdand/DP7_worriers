package com.alphabet;
/* A
 * A B
 * A B C
 * A B C D
 * A B C D E
 */

public class RightAngledAlphabets {
	public static void main(String args[]) {
		for(char i='A';i<='I';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
}
}