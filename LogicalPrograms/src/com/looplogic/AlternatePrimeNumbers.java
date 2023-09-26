package com.looplogic;

public class AlternatePrimeNumbers {
   static boolean checkPrime(int num)
   {  
	  boolean status=true;
	   if(num==0||num==1)
	   {
		   status=false;
	   }
	   else
	   {   
	     for(int i=2;i<num;i++)
	     {
		   if(num%i==0)
		   {
			   status=false;
			   break;
		   }
		 }
	   } 
	  return status;
	
   }
	
   public static void main(String[] args) {
		System.out.println("print alternate prime numbers from 1-50: ");
		for(int i=1;i<=50;i++)
		{
          if(checkPrime(i))
          {
        	  System.out.print(i+" ");
          }

		}
          
	}

}
