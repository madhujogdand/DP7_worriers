package com.labString;

public class RemoveExtraSpaces {

	static void checkSpaces(String st)
	{
		String s[]=st.split("\\s");
		String newStr="";
		for(int i=0;i<s.length;i++)
		{
			
				newStr=newStr+s[i]+" ";
				
			
			
		}
		System.out.print(newStr);
	}
	public static void main(String[] args) {
		String str="I am  Madhulika   Gore";
        System.out.println("Before:"+str);
        checkSpaces(str);
	}

}
