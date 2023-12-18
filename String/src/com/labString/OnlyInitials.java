package com.labString;

public class OnlyInitials {

	static void checksentence(String st)
	{
		String starr[]=st.split("\\s");
		String s="";
		for(int i=0;i<starr.length;i++)
		{
			
			if(i==starr.length-1)
			{
				s+=starr[i];
			}
			else
			{
				char ch=starr[i].charAt(0);
				s+=ch+".";
			}
			
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
	   String str= "Madhulika Govind Gore";
	   checksentence(str);
	}

}
