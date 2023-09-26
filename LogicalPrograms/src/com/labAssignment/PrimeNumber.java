package com.labAssignment;

public class PrimeNumber {

	static void checkPrime(int num)
	{
		
//		if((num==0) ||(num==1))
//			status=false;
		while(num>0)
		{
			boolean status=true;
		  int rem=num%10;
		  for(int i=2;i<rem;i++)
		  {
			  
			  if(rem%i==0)
			  {
				  status=false;
				  break;
			  }
		  }
		  	  
		     if(status==true)
		      {
			 System.out.println(rem);
		      }
		 
		  num/=10;
		}
	}
		//return status;
	
	public static void main(String[] args) {
		int num=78654329;
        checkPrime(num);
	}

}

