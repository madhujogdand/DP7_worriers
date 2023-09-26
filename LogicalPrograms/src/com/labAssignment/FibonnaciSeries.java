package com.labAssignment;

public class FibonnaciSeries
{
	public static void main(String[] args)
	{
        int n1 = 0;
		int n2 = 1;
		System.out.println("Fibbonaci number series upto 500:");
		System.out.println(n1 + " ");
		for (int i = 1; n1 < 500; i++)
		//while(n1<=500)
		{
			int sum = n1 + n2;
			
			n1 = n2;
			n2 = sum;
			
			if(sum%5==0)
				{
					continue;
				}
			else
			{
				System.out.println(sum + " ");
			}
			
		}
		
		

	}

}
