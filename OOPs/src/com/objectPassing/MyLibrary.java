package com.objectPassing;

import com.encapsulation.Book;
import java.util.Scanner;
public class MyLibrary {
	static Scanner sc=new Scanner(System.in);
    static void insertBook(Book b) 
    {
        System.out.println("enter Book Id: ");
   	    b.setBookId(sc.nextInt());
        System.out.println("enter Book Name: ");
        b.setBname(sc.next());
        System.out.println("enter Book Price: ");
        b.setPrice(sc.nextFloat());
    }
	public static void main(String[] args) {
		
        Book b1=new Book();
        insertBook(b1);
        
        Book b2=new Book();
        insertBook(b2);
        
        Book b3=new Book();
        insertBook(b3);
        
        System.out.println("------------------------------");

	    System.out.println(b1);
	    System.out.println(b2);
	    System.out.println(b3);
	
	}

}
