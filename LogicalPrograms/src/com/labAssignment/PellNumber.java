package com.labAssignment;

public class PellNumber {
	static void pellSeries(int num)
	{
		int a=0, b=1;
		
       System.out.print(a+"  "+b+"  ");
				
	   for(int i=2;i<=num;i++)
      
		{
		  int sum=b*2+a;
		  System.out.print(sum+"  ");
		  a=b;
		  b=sum;
		}
	}
   public static void main(String[] args) {
	
	int num=10;
	pellSeries(num);
	}
}	




