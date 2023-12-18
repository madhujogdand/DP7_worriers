package com.stringLogical;

public class StringIntern {

	public static void main(String[] args) {
		String s1="java";
        System.out.println(s1.hashCode());
        
         
		String s2=new String("java");
         System.out.println(s2.hashCode());
         
         s2=s2.intern();
         System.out.println(s1==s2);
	}

}
