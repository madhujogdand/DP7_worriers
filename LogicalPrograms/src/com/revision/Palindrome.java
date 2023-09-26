package com.revision;

public class Palindrome {
	static void checkPalindrome(int num)
	{
		int originalNum=num;
		int rev=0;
		do
		{
			int r= num%10;
			rev=rev*10+r;
			num/=10;
			
		
		}while(num!=0);
		
		System.out.println("Original number:"+originalNum);
		System.out.println("Reverse number :"+rev);
		
		if(originalNum==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int num=2334;
		
	    checkPalindrome(num);
	}

}
