package com.stars;
/*         *
 *       * *
 *     * * *
 *   * * * *
 * * * * * *
 */
public class LeftAngledStars {

	public static void main(String[] args) {
		int n=7;
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
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}