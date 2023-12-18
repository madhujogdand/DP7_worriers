package com.words;

import java.util.Scanner;

public class RepeatedWord {

	static void checkCommon(String st) {
		String str[] = st.split("\\s");
		int maxCount = 0;
		String word = " ";
		int count;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("visited")) {
				continue;
			}
			count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					count++;
					str[j] = "visited";
				}
			}
			System.out.println(str[i] + "--->" + count);
			if (count > maxCount) {
				maxCount = count;
				word = str[i];
			}

			if (count > 1) {
				System.out.println("Duplicate word:" + str[i]);
			}
			if (count == 1) {
				System.out.println("common word:" + str[i]);
			}
		}
		System.out.println("Most repeated word:" + word);

	}

	public static void main(String[] args) {
		
		String str="i love my india because india is my country and my country is great";
		checkCommon(str);
	}

}
