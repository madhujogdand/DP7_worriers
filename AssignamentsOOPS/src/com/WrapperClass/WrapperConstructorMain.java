package com.WrapperClass;

class WrapperCons {
	public WrapperCons(Byte b) {
		System.out.println("byte value is: " + b);
	}

	public WrapperCons(Short s) {
		System.out.println("short value is: " + s);
	}

	public WrapperCons(Integer i) {
		System.out.println("integer value is: " + i);
	}

	public WrapperCons(Long l) {
		System.out.println("long value is: " + l);
	}

	public WrapperCons(Character c) {
		System.out.println("character  value is: " + c);
	}

	public WrapperCons(Float f) {
		System.out.println("float value is: " + f);
	}

	public WrapperCons(Double d) {
		System.out.println("double value is: " + d);
	}

	public WrapperCons(Boolean a) {
		System.out.println("boolean value is: " + a);
	}
}

public class WrapperConstructorMain {
	public static void main(String[] args) {
		Byte b = 127;
		Double d = 50.23d;
		Integer i = 15;
		WrapperCons w1 = new WrapperCons(b);
		WrapperCons w2 = new WrapperCons(d);
		WrapperCons w3 = new WrapperCons(i);
	}

}