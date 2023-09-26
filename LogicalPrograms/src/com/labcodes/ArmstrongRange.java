package com.labcodes;
public class ArmstrongRange {
	static int countNumber(int num)
	{
		int count=0;
		while(num!=0)
    	{
    		count++;
    		num/=10;
    	}
		return count;
	}
    
    static boolean checkArmstrong(int num,int n )
    {   
    	int original=num;
    	int sum=0;
       while(num!=0) 
       {
    	   int pow=1;
    	   int rem=num%10;
    	   for(int i=1;i<=n;i++)
           {
             pow=pow*rem;
           }
    	   sum=sum+pow;
    	   num/=10;
       }

       
       if(sum==original)
       {
    	   return true;
       }   
       else
       {
    	   return false;
       }
     }
     
	public static void main(String[] args) {

	   System.out.println("print numbers between 1 to 1700: ");
	   
	   System.out.println();
	  
	    for(int i=1;i<=1700;i++)
	    {
	    	 int n=countNumber(i);
	    	if(checkArmstrong(i,n))
	    	{
	    		System.out.println(i);
	    	}
	      
	   }
	
	}
}
