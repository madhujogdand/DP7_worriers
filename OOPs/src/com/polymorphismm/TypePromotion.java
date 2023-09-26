package com.polymorphismm;

public class TypePromotion {

	
//		static void display(int n)
//		{
//			System.out.println("In int:");
//			System.out.println(n);
//		}
	//	
		static void display(float n)
		{
			System.out.println("In float:");
			System.out.println(n);
		}
		
		static void display(long n)
		{
			System.out.println("In long:");
			System.out.println(n);
		}
		
		
		public static void main(String[] args) {
			
			display(5); // here int got converted to float
			//display('A'); // if float and int are present: nearest
			
			// int: float and long : promoted to long
			

	}

}
