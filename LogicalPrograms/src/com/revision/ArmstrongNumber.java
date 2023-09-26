package com.revision;
	// 153
	// count number of digits:3
	// 1^3 +5^3 +3^3 === if this is equal to 153 

	// 1456
	// count=4
	// 1^4 +4^4+ 5^4+ 6^4= 

	public class ArmstrongNumber {
		
		static int countdigits(int num)
		{
			int count=0;
			do
			{	
				num/=10;
				count++;
			}while(num!=0);
			System.out.println("count"+count);
			return count;
		}
		
		static void checkArmstrong(int num, int count)
		{
		    int original=num;
		    double sum=0;
		    do
		    {
		    	int r=num%10;
		    	sum= sum+ Math.pow(r, count);
		    	num/=10;
		    	
		    }while(num!=0);
		    
		    System.out.println("Sum using logic:"+sum);
		    
		    if(sum==original)
		    {
		    	System.out.println("Armstrong number");
		    }
		    else
		    {
		    	System.out.println("Not an armstrong number");
		    }
			
		}
		
		static void checkArmstrong1(int num, int count)
		{
		    int original=num;
		    double sum=0;
		    do
		    {
		    	int r=num%10;
		        // to calculate r raise to power count
		    	// r - base , count-power
		    	// pro- result
		    	int pro=1;
		    	for(int i=1;i<=count;i++)
		    	{
		    		pro= pro*r;
		    	}
		    	////////////////////////////////
		    	sum+=pro;
		    	//System.out.println(sum);
		    	
			    num/=10;
		    	
		    }while(num!=0);
		    
		    System.out.println("Sum using logic:"+sum);
		    
		    if(sum==original)
		    {
		    	System.out.println("Armstrong number");
		    }
		    else
		    {
		    	System.out.println("Not an armstrong number");
		    }
			
		}
		
		
		public static void main(String[] args) {
			
			int num= 153; // 
			
			int n= countdigits(num);
			
			checkArmstrong1(num, n);
			
		}

	}


