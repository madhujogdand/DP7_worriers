package com.revision;

import java.util.Scanner;

public class SingleDigitNumber {
	static int checkSingle(int num) {
		int sum = 0;

		// condition: repeat sum>9

		while (num > 0 || sum > 9)
		{
           if (num == 0)
           {
				num = sum;
				sum = 0;
			}
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int ans = checkSingle(num);

		System.out.println(num + " its single digit sum is: " + ans);
	}

}
