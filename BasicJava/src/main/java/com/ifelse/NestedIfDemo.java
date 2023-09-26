package com.ifelse;

public class NestedIfDemo {

	public static void main(String args[]) {
		
		//percentage>=65:college admission
		//>=80: science and commerce stream
		//<=80:commerce stream
	
		float per=57f;
		
	if(per>=65)
	{
	
	System.out.println("Eligible for college...");
		if(per>=80)
		{
		  System.out.println("Can opt science and commerce stream");
		}
		else
		{
			System.out.println("Can opt commerce stream");
		}
	}
	else 
	   { 
		System.out.println("Not Eligible for college....");
	   }
}
}
	
	
