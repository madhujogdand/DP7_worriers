package com.varags;

public class VaragsDemo2 {

	static void method1(int n1,int n2)
	{
		System.out.println(n1+n2);
	}
	static void method1(int n1,int n2,int n3)
	{
		System.out.println(n1+n2+n3);
	}
	static void method3(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
		}
		System.out.println("Sum :"+sum);
	}
	public static void main(String[] args) {
		method1(4,6);
		method1(4,6,8);
		
		System.out.println("-----------------------------");
		
		method3(4,6,5);
        method3(4,8);
		method3(4,6,9,10);
		

	}

}
