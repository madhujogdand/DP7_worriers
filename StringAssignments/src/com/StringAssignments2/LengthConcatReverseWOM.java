package com.StringAssignments2;
//15. Length, concat, reverse w.o method
public class LengthConcatReverseWOM {
	static void checkLength(String st1) {
		int count = 0;
		char ch[] = st1.toCharArray();
		for (char c : ch) {
			count++;
		}
		System.out.println("Length:" + count);
	}

	static void concat(String st1, String st2) {
		char ch1[] = st1.toCharArray();
		char ch2[] = st2.toCharArray();
		char newChar[] = new char[ch1.length + ch2.length + 1];

		int count = 0;
		for (char c : ch1) {
			newChar[count] = c;
			count++;
		}
		newChar[count] = '\0';
		count++;
		for (char c : ch2) {
			newChar[count] = c;
			count++;
		}
		System.out.println(newChar);
	}

	static void reverse(String st1) {
		int j=0 ;
		char ch[] = st1.toCharArray();
		char newChar[] = new char[ch.length];
		for (int i = 0; i < ch.length; i++)
		{
			for (j = ch.length - 1; j >= 0; j--)
			{
				newChar[j] = ch[i];
			}
			
		}
		System.out.println(newChar[j]);
	}

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";

		System.out.println("String 1:" + str1);
		System.out.println("String 2:" + str2);
		System.out.println("============================");
		checkLength(str1);
		System.out.println("============================");
		concat(str1, str2);
		System.out.println("============================");
		reverse(str1);
	}

}
