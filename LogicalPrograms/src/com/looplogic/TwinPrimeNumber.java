package com.looplogic;

import java.util.Scanner;

public class TwinPrimeNumber {

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
	         Scanner sc=new Scanner(System.in);
				System.out.println("Enter number 1:");
				int num1=sc.nextInt();
				System.out.println("Enter number 2:");
				int num2=sc.nextInt();
				
                 boolean status =false;
                 
		          if(checkPrime(num1))
		          {
		        	  if(checkPrime(num2))
		        	  {
		        	    if((num2-num1)==2||(num2-num1)==-2)
		        	    {
		        		  status=true;
		        	    }
		              }
		          }
		          
		         if(status)
		         {
		        	 System.out.println("Numbers are twin prime");//(3,5)
		         }
		         else
		         {
		        	 System.out.println("Numbers are not twin prime");//(3,7)
		         }
		          
			}

	}


