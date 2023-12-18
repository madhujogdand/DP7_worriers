package com.LogicalArray;
/*14. WAP to check if an array of integers contains
  two specified elements 65 and 77.
 */
public class CheckArrayIntegers {

	static void checkElements(int ar[])
	{
		
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]==65 && ar[i]==77)
			{
				
				System.out.println("Array contains both 65 & 77");
				break;
			}
			else if(ar[i]==65)
			{
				
				System.out.println("Array contains only 65");
			     break;
			}
			else if(ar[i]==77)
			{
				
				System.out.println("Array contains only 77");
			    break;
			}
			else 
			{
				System.out.println("Array does not contain both 65&77");
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,45,77,65};
		checkElements(arr);
	}

}
