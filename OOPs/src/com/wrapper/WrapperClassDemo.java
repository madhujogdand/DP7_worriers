package com.wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
		//Autoboxing: primitive to wrapper class
		//method:value of
		
		int num=23;
		Integer i=new Integer(45);
		Integer i1=45;
		
		//convert
		Integer j= Integer.valueOf(num);
		//conversion-auto
		
		Integer k=num;
		System.out.println(num+" "+i+" "+j+" "+k);
		
		//Unboxing:wrapper class to premitive
		//intvalue
		
		Float f1=new Float(23.4f);
		float f2=f1.floatValue();
		
		//unboxing-auto 
				
		 float f3=f1;//compiler adds it .floatValue()
		 System.out.println(f1+" "+f2+" "+f3);
		
		
	}

}
