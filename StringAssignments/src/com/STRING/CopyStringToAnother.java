package com.STRING;
import java.util.Arrays;
public class CopyStringToAnother {
	//8.	Write a Java program to copy one string to another string.


	

		static void copyString(String st)
		{
			char[] ch=st.toCharArray();
			char newStr[]=new char[ch.length];
			for(int i=0;i<ch.length;i++)
			{
				newStr[i]=ch[i];
			}
			System.out.println(Arrays.toString(newStr));
		}
		public static void main(String[] args) {
		String str="India is my country";
		copyString(str);
		}

}
