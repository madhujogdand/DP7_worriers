package com.words;

public class withoutFirstLastReverse {

	static void   checkFirstLast(String s)
	{
		String splitst[]=s.split("\\s");
		String revst="";
		revst=revst+splitst[0]+" ";
		for(int i=1;i<splitst.length-1;i++)
		{
			for(int j=splitst[i].length()-1;j>=0;j--)
			{
				revst=revst+splitst[i].charAt(j);
			}
			revst=revst+" ";
		}
		  
		revst=revst+splitst[splitst.length-1];
		System.out.println("After:"+revst);
	}
	
	public static void main(String[] args) {
		String str="I like to learn java";
		System.out.println("Before:"+str);
        checkFirstLast(str);
	}

}
