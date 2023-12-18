package com.WrapperClass;

class WrapperParse {
	/*
	 * public WrapperParse(String s1) { Integer i1 = Integer.parseInt(s1);
	 * System.out.println(i1); }
	 */
}

public class WrapperParseMain {
	public static void main(String[] args) {
		String s1 = "100";
		Integer i1 = Integer.parseInt(s1);
		System.out.println(i1);

		Short s2 = Short.parseShort(s1);
		System.out.println(s2);

		Float f1 = Float.parseFloat(s1);
		System.out.println(i1);

		Double d1 = Double.parseDouble(s1);
		System.out.println(d1);

		// Integer i2 = Integer.valueOf(s1);

	}
}
