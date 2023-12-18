package com.StringAssignments2;

import java.util.Scanner;

public class ChangeCase {
	/*
	 * 6. Change the case of all the character
	 * 
	 * JaVa- jAvA 7. Change the case of the vowels
	 */

	static void checkVowels(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (ch >= 'a' && ch <= 'z') {
					ch = ((char) (ch - 32));
					System.out.print(ch);
				} else if (ch >= 'A' && ch <= 'Z') {
					ch = ((char) (ch + 32));
					System.out.print(ch);
				}
			} else {
				// ch=ch;
				System.out.print(ch);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = sc.next();
		checkVowels(word);
		sc.close();
	}

}
