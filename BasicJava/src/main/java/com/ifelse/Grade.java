package com.ifelse;

import java.util.Scanner;

public class Grade {
	public static void main(String args[]) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Name:");
			String name=sc.next();
			System.out.println("Enter the marks of sub1:");
			int sub1=sc.nextInt();
			System.out.println("Enter the marks of sub2:");
			int sub2=sc.nextInt();
			System.out.println("Enter the marks of sub3:");
			int sub3=sc.nextInt();
		    System.out.println("Enter the marks of sub4:");
		    int sub4=sc.nextInt();
		    System.out.println("Enter the marks of sub5:");
		    int sub5=sc.nextInt();
		    
		    int total=sub1+sub2+sub3+sub4+sub5;
		    double per=(total*100/500);
		    
		   if(per>=90 && per<=100)
		    {
		       System.out.println(name+"has scored"+per+"%"+"Congratulations!! Passed with grade: A");
		    }
		   else if(per>=75 && per<89 )
		         {
		    	 System.out.println(name+"has scored"+per+"%"+"Congratulations!! Passed with grade: B");
		         }
		         else if(per>=60 && per<74)
		              {
		    	       System.out.println(name+"has scored"+per+"%"+"Congratulations!! Passed with grade: C");
		              }
		              else if(per>=40 && per<59)
		                   {
		            	    System.out.println(name+"has scored"+per+"%"+"Congratulations!! Passed with grade: D");
		                   }
		                   else 
		                   {
		                	   System.out.println(name+"has scored"+per+"%"+"Fail");  
		                   }
		   
			sc.close();

		    				
			
		}

}
