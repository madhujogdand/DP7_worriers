package com.looplogic;

import java.util.Scanner;

public class ReverseSum {
	static boolean checkReverseNum(int num) {
		int original = num;
		int last3Sum = 0;
		int first3Sum = 0;
		// sum of last 3 digits
		for (int i = 0; i < 3; i++) {
			int rem = num % 10;
			last3Sum += rem;
			num /= 10;
		}
		System.out.println("last 3 digits sum is:" + last3Sum);
		num = original;
		// reverse the number
		int revNum = 0;
		while (num != 0) {
			int rem = revNum % 10;
			revNum = revNum * 10 + rem;
			revNum /= 10;
		}
		//sum of first 3 digit
		for (int i = 0; i < 3; i++) {
			int rem = num % 10;
			first3Sum += rem;
			revNum /= 10;
		}
		System.out.println("first 3 digits sum is:" + first3Sum);
        if(last3Sum==first3Sum)
        {
        	return true;
        }
        else
        {
		  return false;
        }

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
        //num=12321;
		//System.out.println(checkReverseNum(num));
		checkReverseNum(num);
	}

}
