package com.labString;

public class RemoveFirstLastletter {

	static void checkFirstLast(String st)
	{
	
		for(int i=0;i<st.length();i++)
		{
			
		System.out.println(st.substring(1,st.length()-1));
				break;
			
		}
	}
	public static void main(String[] args) {
		String str = "Hello world";
		checkFirstLast(str);
	}

}
