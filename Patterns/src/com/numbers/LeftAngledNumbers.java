package com.numbers;
/*         1
 *       1 2
 *     1 2 3
 *   1 2 3 4
 * 1 2 3 4 5
 */
public class LeftAngledNumbers {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++)
		{
			//for spaces
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			//for numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
