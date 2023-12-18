package com.CAArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/*13. Create an array which contains heterogeneous elements
 * .*/
public class Q13 {

	public static void main(String[] args) {

		Object[] obj=new Object[5];
		
		obj[0]="Radha";
		obj[1]=23;
		obj[2]=4.4f;
		obj[3]=12.5;
		obj[4]='M';
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
		System.out.println("========================================================");
		
		
		
	}

}
