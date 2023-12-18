package com.LogicalArray;

import java.util.Arrays;

/*16. WAP to arrange the elements of an given array of integers where all Even integers 
appear before all the Odd integers.*/
public class EvenBeforeOdd {

	static int[] checkEven(int ar[])
	{
      int newArray[]=new int[ar.length];
      int count=0;
      for(int i=0;i<ar.length;i++)
      {
    	  if(ar[i]%2==0)
    	  {
    		  newArray[count]=ar[i];
    		  count++;
    	  }
      }
      for(int i=0;i<ar.length;i++)
      {
    	  if(ar[i]%2!=0)
    	  {
    		  newArray[count]=ar[i];
    		  count++;
    	  }
      }
	return newArray;
	}

	public static void main(String[] args) {
		int arr[]= {5,2,4,3,1,8,6,7};
		System.out.println("Before:"+Arrays.toString(arr));
        System.out.println(Arrays.toString(checkEven(arr)));
	}

}
