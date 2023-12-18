package com.labString;

import java.util.Arrays;
//without split method
public class FirstLetterCapital1 {

	static void firstLetterCapital(String st) {
		String[] s = st.split("\\s");
         for (int i = 0; i < s.length; i++)
         {
			char ch[] = s[i].toCharArray();
			for (int j = 0; j < ch.length; j++)
			{
				if(j==0)
				{
					ch[j]=(char) (ch[j]-32);
				}
				
					
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		String str = "india is beautiful country";
		System.out.println("Before:" + str);
		firstLetterCapital(str);
	}

}
