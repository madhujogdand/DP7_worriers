/*generate your own function to satisfy the relationship between the inputs and outputs.
Your task is to create a function that, when fed the inputs below, produce the sample outputs shown.
Examples
832 ➞ 594
51 ➞ 36
7977 ➞ 180
1 ➞ 0
665 ➞ 99
149 ➞ 0*/

package com.looplogic;
import java.util.Scanner;
public class FunctionTest {
	static int reverseNum(int num)
	{
		int revNum=0;
		do
		{
			int r= num%10;
			revNum= revNum*10+r;
			num/=10;
			
		}while(num!=0);
		
		return revNum;
	}
	
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		int revN= reverseNum(n);
		
		//System.out.println(num);
		//System.out.println(revN);
		
		int diff= n-revN;
		
		if(diff<0)
		{
			System.out.println(0);
		}
		
		else
		{
			System.out.println(diff);
		}
		
sc.close();
	}

}
