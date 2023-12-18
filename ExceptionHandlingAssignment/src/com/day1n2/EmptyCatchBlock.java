package com.day1n2;

public class EmptyCatchBlock {
	public static void main(String[] args) {
		try {
		String s1 = null;
		String s2 = s1.substring(5);
		System.out.println(s2);
		}catch (Exception e) {// it is not allow if we remove Exception e
			// it is allow
			System.out.println(e);
		}
	}

}
