package com.labString;
//1. Check string in palindrome
import java.util.Scanner;

public class FindPalindrome {

	static void checkPalindrome(String st) {
		boolean status=true;
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			status=true;
			for (int j = ch.length - 1-i; j >= 0; j--) {
				if (ch[i] != ch[j]) {
					status = false;
					//break;
				}
			}
			
		}
		if (status) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word1:");
		String word = sc.next();

		checkPalindrome(word);

		sc.close();
	}

}
