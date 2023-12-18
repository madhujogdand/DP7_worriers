package com.string;

public class StringMutable {

	public static void main(String[] args) {
		String s1="java";
		System.out.println(s1.hashCode());//diff hashcode
		s1="corejava";
		System.out.println(s1.hashCode());//diff hashcode
        System.out.println(s1);
        
        String s2="Madhu";
		System.out.println(s1.hashCode());//same hashcode
		s2.concat("Gore");//"Madhu".concat("Gore")
		System.out.println(s2.hashCode());//same hashcode
        System.out.println(s2);
        
        String s3="Madhu";
		System.out.println(s3.hashCode());//diff hashcode
		s3=s2.concat("Gore");
		System.out.println(s3.hashCode());//same hashcode
        System.out.println(s3);
        
        String s4="MadhuGore";
		System.out.println(s4.hashCode());//same hashcode
		System.out.println(s4);
	
		
//	    int num=89;
//	    System.out.println(num+89);
//	    System.out.println(num);
//	
	
	}

}
