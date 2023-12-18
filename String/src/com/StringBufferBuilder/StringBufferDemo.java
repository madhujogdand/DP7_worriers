package com.StringBufferBuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
//		StringBuffer sb1=new StringBuffer();//16
//		System.out.println(sb1.capacity());
//		
//		StringBuffer sb2=new StringBuffer("Hello");//16+5=21
//		System.out.println(sb2.capacity());
		
		StringBuffer sb3=new StringBuffer(5);//5
		System.out.println(sb3.capacity());

		//+,concat
		//append()
		
		String s1="java";
		s1.concat("programs");
		s1=s1.concat("programs");
		System.out.println(s1);
		
		sb3.append("java");
		System.out.println(sb3);
		System.out.println("Capacity:"+sb3.capacity());
		
		sb3.append("Html");
		System.out.println(sb3);
		System.out.println("Capacity:"+sb3.capacity());//(oldcap*2)+2
	
		String s2="javahtml";
		String s3="javahtml";
		
		
	}

}
