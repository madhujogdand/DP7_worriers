package com.loopassignment;

public class PrimeNumber400to300 {
	public static void main(String args[]) {
		
	    System.out.println("Print prime numbers between 400 to 300:  ");
	   
	    int num=300, count;
	    for(int i=400;i>num;i--)
	    {
	    	count=0;
	      for(int j=2;j<=2;j++)	
	      {
		  if(i%j==0) 
		  {
		   count++;
			  
			  break;
		  }
		  
	    }
	    if(count==0)
	    {
	    	System.out.println(i);
	    }
	    }  
}
}