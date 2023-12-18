package com.day1n2;

public class PropagateUncheckedException {
	static void m1() {
		System.out.println("in method m1");
		try {
			m2();			
		}catch (ArithmeticException e) {
			System.out.println("handeld in method m1 "+e);
		}
	}
	static void m2() {
		System.out.println("in method m2");
		//try {
		m3();
		//}catch (ArithmeticException e) {
			//System.out.println("handeld in method m2 "+e);
		//}
	}
	static void m3() {
		System.out.println("in method m3");
		int a=10,b=0;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		m1();
	}
}
