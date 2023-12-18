package com.day1n2;

import java.io.File;
import java.io.IOException;

public class PropagateCheckedException {
	static void m1() {
		System.out.println("in method m1");
		try {
			m2();
		} catch (IOException e) {
			System.out.println("handeld in method m1 " + e);
		}
	}

	static void m2() throws IOException {
		System.out.println("in method m2");
		//try {
			m3();
//		} catch (IOException e) {
//			System.out.println("handeld in method m2 " + e);
//		}
	}

	static void m3() throws IOException {
		System.out.println("in method m3");
		File file = new File("test.txt");
		file.createNewFile();
	}

	public static void main(String[] args) {
		m1();
	}
}
