package com.switchst;

public class BiggerNo {

	public static void main(String args[]) {
		
		int num1=90;
		int num2=78;
		
		int max;
		
		max=(num1>num2)?num1:num2;
		
		System.out.println(max+"is greater");
		
		if(num1>num2)
		{
			max=num1;
			
		}
		else
		{
			max=num2;
		}
		System.out.println(max+"is greater");
	}
}
