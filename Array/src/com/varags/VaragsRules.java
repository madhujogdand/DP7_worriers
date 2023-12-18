package com.varags;

public class VaragsRules {

	static void method1(int n1,int n2)
	{
		System.out.println(n1+n2);
	}
	static void method1(int n1,int n2,int n3)
	{
		System.out.println(n1+n2+n3);
	}
	
	//Rule:1---->there can be only one varags
//	 static void display(int ...a,String ...s)
//	{
//		
//	}
	//Rule:2--->last argument int the method
	static void printMe(int num, String ...str)
	{
		System.out.println(num);
		for(String s:str)
		{
			System.out.println(s);
		}
	}	
	public static void main(String[] args) {
		method1(4,6);
		method1(4,6,8);
		
		System.out.println("-----------------------------");
		
		//display(1,2,3,"Shuruti","Heena");
		printMe(1,"Dipti","Radha","Aashu");

		
		//printMe(1,"Dipti","Radha","Aashu",78.6f);

	}

}
