package com.StringAssignments2;

import java.util.Scanner;

public class NextAlphabet {
	/*9. print next alphabet of each character
	   Java - Kbwb  */
	
		static void nextAlphabet(String s) {
			char ch[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {

				ch[i]++;

			}
			System.out.println(ch);

		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter word:");
			String word = sc.next();
			nextAlphabet(word);
			sc.close();

		}
}
