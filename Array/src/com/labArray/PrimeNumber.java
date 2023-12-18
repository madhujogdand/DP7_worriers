package com.labArray;

public class PrimeNumber
{
    static void checkPrime(int ar[])
	{
		int sum = 0;
		for (int i = 0; i < ar.length; i++)
		{
			Boolean flag = true;
			if(ar[i]==0 || ar[i]==1)
			{
				flag=false;
			}
			for (int j = 2; j < ar[i]; j++)
			{
				if (ar[i] % j == 0)
				{
					flag = false;
					break;
				}

			}
			if (flag)
			{
				sum = sum + ar[i];

				System.out.println("prime numbers are:" + ar[i]);
			}
        }
		System.out.println("sum of prime numbers:" + sum);
	}

	public static void main(String[] args)
	{
		int arr[] = {1, 7, 4, 5, 6, 11,0,2 };
		checkPrime(arr);

	}

}
