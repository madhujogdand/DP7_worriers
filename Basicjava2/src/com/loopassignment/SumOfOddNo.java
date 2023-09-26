package com.loopassignment;

public class SumOfOddNo {
     public static void main(String args[]) {
        int sum = 0;
		for (int i = 552; i > 444; i--)
		{
            if (i % 2 != 0)
            {
				sum += i;
				System.out.print(i+" ");
			}
		}
	    System.out.println();
		System.out.println("sum of odd no.:" + sum);
	}
}
