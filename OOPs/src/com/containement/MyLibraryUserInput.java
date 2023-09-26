package com.containement;

import java.util.Scanner;

public class MyLibraryUserInput {

	    static Scanner sc=new Scanner(System.in);
	    void enterBookDetails(Book b)
	    {
	    	System.out.println("Enter Book id:");
	    	b.setBId(sc.nextInt());
	    	
	    	System.out.println("Enter Book name:");
	    	b.setBname(sc.next());
	    	
	    	System.out.println("Enter Book price :");
	    	b.setPrice(sc.nextFloat());
	    	
	    	b.setAuthor(new Author());
	    	
	    	System.out.println("Enter Author id:");
	    	b.getAuthor().setId(sc.nextInt());
	    	
	    	System.out.println("Enter Author name:");
	    	b.getAuthor().setAname(sc.next());
	    	
	    	
	    }
	    
		public static void main(String[] args) {
			MyLibraryUserInput library=new MyLibraryUserInput();
			Book b1=new Book();
			Book b2=new Book();

	        library.enterBookDetails(b1);
	        library.enterBookDetails(b2);
	        
	        System.out.println(b1);
	        System.out.println(b2);

		}


	}


