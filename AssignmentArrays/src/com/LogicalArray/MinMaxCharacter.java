package com.LogicalArray;
/*17. WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, 
‘R’], so min character is ‘A’. */
/*18. WAP to find max character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, 
‘R’, ‘Z’, ‘p’], so max character is ‘x’.*/
public class MinMaxCharacter {

	static void findMin(char ar[])
	{
		char min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("Min character:"+min);
	}
	static void findMax(char ar[])
	{
		char max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("Min character:"+max);
	}
	public static void main(String[] args) {
	char arr[]= {'A','D','E','X','Z','R'};
      findMin(arr);
      findMax(arr);
	}

}
