package com.looplogic;

public class AlternatePrimeNumbers {
	static void checkPrime(int n)
	{
		int count;
		int result = 1;

		for (int i = 2; i <= n; i++)
		{
			count = 0;
			for (int j = 1; j <= i; j++)
			{
				if (i % j == 0)
				{
					count++;
				}
			}

			if (count == 2)
			{
				result++;
				if (result % 2 == 0)
				{
					System.out.println(i + " ");
				}
			}

		}
	}

	public static void main(String[] args) {
		System.out.println("print alternate prime numbers from 1-50: ");
		checkPrime(50);
		

	}

}
