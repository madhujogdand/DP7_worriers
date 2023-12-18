package com.words;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String str = "A big cat is rolling on a big mat";
		System.out.println(str);

		// spit method

		String st[] = str.split("\\s");// str.split(" ")
		System.out.println(Arrays.toString(st));
	}

}
