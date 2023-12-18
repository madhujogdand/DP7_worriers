package com.labString;

public class AverageOfNo {

	static void checkNo(String st) {
		char ch[] = st.toCharArray();
		int sum = 0;
		int avrg = 1;
		int count = 0;
		for (int i = 0; i < ch.length; i++)
		{
			if (Character.isDigit(ch[i]))
			{
				sum+= Character.getNumericValue(ch[i]);
				
				count++;
				System.out.println("sum"+sum);
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
