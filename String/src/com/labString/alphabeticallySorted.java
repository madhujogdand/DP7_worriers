package com.labString;

public class alphabeticallySorted {

	static void checkAlphabet(String st)
	{
		boolean status=false;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				   status=true;
				   
				}
			}
		}
			if(status==false)
			{
				System.out.println("Alphabetically sorted string");
			}
			else
			{
				System.out.println("Alphabetically not sorted string");
			}
		
	}
	public static void main(String[] args) {
		String str="aaacebcd";
         checkAlphabet(str);
	}

}
