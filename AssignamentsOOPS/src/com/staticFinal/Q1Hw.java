package com.staticFinal;
/*//1.Write a method to accept variable no of integers. Method should find sum of all the integers and display the result.*/
public class Q1Hw {
	public static void main(String[] args)
	{
        int sum1 = calculateSum(1, 2, 3, 4, 5);
        System.out.println("Sum 1: " + sum1);

        int sum2 = calculateSum(10, 20, 30);
        System.out.println("Sum 2: " + sum2);
    }

    public static int calculateSum(int... numbers)
    {
        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
        }
        return sum;
    }
}
