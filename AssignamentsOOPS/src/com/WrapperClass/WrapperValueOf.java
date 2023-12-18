package com.WrapperClass;

public class WrapperValueOf {
	public static void main(String[] args) {
		int a = 10;
		String b = "20";
		char c = 'a';
		
		Integer i1 = Integer.valueOf(a);
		System.out.println(i1);
		
		Float f1 = Float.valueOf(a);
		System.out.println(f1);
		
		Double d1  = Double.valueOf(a);
		System.out.println(d1);
		
		Long l1 = Long.valueOf(a);
		System.out.println(l1);
		
		Byte b1 = Byte.valueOf(b);
		System.out.println(b1);
		
		Boolean b2 =  Boolean.valueOf(true);
		System.out.println(b2);
		
		Short s1 = Short.valueOf(b);
		System.out.println(s1);
		
		Character c1 = Character.valueOf(c);
		System.out.println(c1);
		
		//Q.7
		String str = "10";
		Integer i2 = Integer.valueOf(str);
		System.out.println(i2);
		
		//Q.8
		Integer i3 = Integer.valueOf(str, 2);// 2=binary, 8=octal, 16=hexadecimal
		System.out.println(i3);
	}

}
