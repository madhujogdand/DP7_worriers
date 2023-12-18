package com.labString;

public class AverageOfNoWOLogic {

	static void checkNo(String st) {
		char ch[] = st.toCharArray();
		int sum = 0;
		int avrg = 1;
		int count = 0;
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] >= 48 && ch[i] <= 57)
			{
				sum += ch[i] - 48;
				count++;
			}
		}
		avrg = sum / count;
		System.out.println("Average of numbers:" + avrg);
	}

	public static void main(String[] args) {
		String str = "a5i9gfj4tabc";
		checkNo(str);
	}

}
