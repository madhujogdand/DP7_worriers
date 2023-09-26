package com.logicaltest1;

public class ArmstrongNumber {
static int count(int num)
{
	int count=0;
	while(num!=0)
	{
		count++;
		num/=10;
	}
	return count;
}
static void checkArmstromg(int num, int n)
{
	int original=num;
	double sum=0;

	while(num!=0)
	{
		int rem=num%10;
		sum=sum+Math.pow(rem,n);
		num/=10;
	}
   if(original==sum)
   {
	   System.out.println("Armstrong");
   }
   else
   {
	   System.out.println("Not Armstrong");
   }
}
public static void main(String args[]) {
	int num=153;
	int n=count(num);
	checkArmstromg(num,n);
   }
}
