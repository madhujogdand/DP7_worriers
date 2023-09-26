package com.switchassignment;

import java.util.Scanner;

public class VowelConso {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char alphabet = sc.next().charAt(0);

		switch (alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is a vowel");

			break;
		default:
			System.out.println("It is Consonent");
		}

		sc.close();
	}
}
