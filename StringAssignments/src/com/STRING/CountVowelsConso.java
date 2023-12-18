package com.STRING;

public class CountVowelsConso {
	/*22.	Write a Java program to count total number of
	 *  vowels and consonants in a string.*/

	
		static void checkvowelsConso(String st) {

			int vowels = 0;
			int cons = 0;
			for (int i = 0; i < st.length(); i++) {
				char ch = st.charAt(i);
				if (ch >= 'a' && ch <= 'z') {
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						vowels++;

					} 
					else
						cons++;
				}

			}
			System.out.println("count of vowels:" + vowels);
			System.out.println("count of consonant:" + cons);
		}

		public static void main(String[] args) {
			String str = "hello java";
			checkvowelsConso(str);

		}

}
