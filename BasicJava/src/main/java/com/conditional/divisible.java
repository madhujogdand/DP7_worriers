//Write a Java program to check whether a number is divisible by 5 and 11 or not

package com.conditional;

import java.util.Scanner;

public class divisible {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int num = sc.nextInt();
        
		if (num % 5 == 0 && num % 7 == 0) {
			System.out.println("Number is duvisible by 5 and 7 ");

		} else {
			System.out.println("Number is not duvisible by 5 and 7");
		}

		sc.close();
	}
}