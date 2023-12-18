package com.STRING;

public class SplitString {
	/*9.	WAP to split string into 2 tokens where string is “HELLO$WORLD”*/
	
		static void splitString(String st)
		{
		 //String[] s=st.split(" ");
		  char[] ch=st.toCharArray();
		  int i;
		  for(i=0;i<ch.length;i++)
		  {
			  if(ch[i]=='$')
			  {
				  ch[i]='\0';
			  }
			  
		  }
		  System.out.println(ch[i]);
		}
		public static void main(String[] args) {
		String str="HELLO$WORLD";
		splitString(str);
		}
}
