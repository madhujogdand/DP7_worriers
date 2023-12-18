package com.staticFinal;
//16.	WAP to overload static method
public class OverloadStatic
{
	 public static int add(int a, int b)
	 {
	        return a + b;
	 }    
	    public static int add(int a, int b, int c)
	    {
	        return a + b + c;
	    }
	    public static double add(double a, double b)
	    {
	        return a + b;
	    }

	    public static void main(String[] args)
	    {
	        int sum1 = OverloadStatic.add(5, 10);
	        System.out.println("Sum of two integers: " + sum1);

	        int sum2 = OverloadStatic.add(2, 4, 6);
	        System.out.println("Sum of three integers: " + sum2);

	        double sum3 = OverloadStatic.add(3.5, 2.5);
	        System.out.println("Sum of two doubles: " + sum3);
	    }

}