package com.ArrayListHw;
/*8.WAP to copy one ArrayList into another*/
import java.util.ArrayList;

public class CopyArrayListToAnother {

	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<>();
	       
	       al.add("Neha");
	       al.add("Radha");
	       al.add("Shraddha");
	       al.add("Shivani");
	       al.add("Shruti");
	       
	       ArrayList<String> al1=new ArrayList<>();  
	       
	       for(int i=0;i<al.size();i++)
	       {
	    	   String s1=al.get(i);
	    	  al1.add(s1);
	       }
	       
	       System.out.println(al1);

	}

}
