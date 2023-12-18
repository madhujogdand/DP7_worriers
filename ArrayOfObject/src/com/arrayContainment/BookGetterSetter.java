package com.arrayContainment;

import java.util.Scanner;

public class BookGetterSetter {
	static Scanner sc = new Scanner(System.in);

	static void EnterDetails(Book b) {
		System.out.println("Enter Book id:");
		b.setId(sc.nextInt());

		System.out.println("Enter Book name:");
		b.setName(sc.next());

		System.out.println("Enter Book price:");
		b.setPrice(sc.nextFloat());

		b.setA(new Author());

		System.out.println("Enter Author id:");
		b.getA().setAid(sc.nextInt());

		System.out.println("Enter Author name:");
		b.getA().setAname(sc.next());

	}

	static void printDetails(Book bk[]) {
		for (Book b : bk) {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		Book bk[] = new Book[3];
		for (int i = 0; i < bk.length; i++)
		{
			
				bk[i]=new Book();
				EnterDetails(bk[i]);
			
		}
		System.out.println("-------------------------------------------");
		printDetails(bk);
	}

}
