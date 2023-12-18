package com.StringAssignments2;

public class Frequency2way {
	//2. Count frequency of characters
	

		static void checkFreq(String s)
		{
			String stemp=s;
			while(stemp.length()>0)
			{
				char ch=stemp.charAt(0);
				int count=1;
				for(int i=1;i<stemp.length();i++)
				{
					if(ch==stemp.charAt(i))
					{
						count++;
					}
				}
				System.out.println("Frequency of:"+ch+" is "+count);
				stemp=stemp.replaceAll(""+ch,"");
			}
			
		}
		public static void main(String[] args) {
			String str="angular";
			checkFreq(str);

		}
}
