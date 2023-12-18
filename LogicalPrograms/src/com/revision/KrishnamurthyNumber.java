package com.revision;

public class KrishnamurthyNumber {
	static void checkNumber(int num)
	{   
		int original=num;
		int sum=0;
		
		do
		{
			int rem=num%10;
			int fact=1;
			for(int i=1; i<=rem;i++)
			{
			
				fact*=i;
			}	
				sum+=fact;
				num=num/10;
				
		}while(num!=0);
		
	    if(original==sum)
		{
		System.out.println(original+"is krishnamurthy");
		}
		else
		{
			System.out.println(original+"is not a krishnamurthy");
		}
	}
	
	
	
    public static void main(String args[]) {
	 int num=145;
	 
	 checkNumber(num);
	 
	 }
}
