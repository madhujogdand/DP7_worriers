package com.words;

import java.util.Arrays;

public class SortByLengthLexo {

	static void sortByLengthLexo(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].length()==st[j].length())
				{
					if(st[i].compareTo(st[j])>0)
					{
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
					}
				}
				else
				{
				  if(st[i].length()>st[j].length())
				    {
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				   }
			    }
		   }
		}	
	}
	public static void main(String[] args) {
		String str[]= {"Java","C","Devops","Angular","Html","Python"};
		System.out.println("Before sort:"+Arrays.toString(str));
		sortByLengthLexo(str);
		System.out.println("after sort length:"+Arrays.toString(str));
		
	}

}
