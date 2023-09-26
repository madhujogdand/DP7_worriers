package com.labcodes;

public class MaximumDigit {
static void checkMaximum(int num)
{
	int digit=0;
	while(num!=0)
	{
		int rem=num%10;
		if(rem>digit)
		{
			digit=rem;
		}
		num/=10;
		
	}
	System.out.println(digit+"is a maximum");

}
public static void main(String args[])
{
    int num=456798;
    checkMaximum(num);
    }


}

