package com.varags;

public class VaragsDemo {

	static void display(int ar[])
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	//ellipsis ...
	//method overloaded......number of arguments
	static void displayElements(int ...a)
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int ar1[]= {2,3,4,5};
		int ar2[]= {5,6};
		int ar3[]= {7,8,9};
		
		display(ar1);
		display(ar2);
		display(ar3);
		
		System.out.println("--------------------------------------");

		displayElements(4,5,6,7);
		displayElements(4,5);
	
	}

}
