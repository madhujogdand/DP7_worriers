package com.OOPs;

import java.util.Scanner;

class Student3 {
	int id;
	String name;

	Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println("Stud id:" + id);
		System.out.println("Stud name:" + name);
	}
}

public class StudentLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 2; i++) {
			System.out.println("Student Id" + i);
			int id = sc.nextInt();
			System.out.println("Student name:" + i);
			String name = sc.next();

			Student3 s = new Student3(id, name);
			s.show();
		}

		sc.close();
	}

}
