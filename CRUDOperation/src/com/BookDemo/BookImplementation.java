package com.BookDemo;

import java.util.Scanner;

public class BookImplementation implements bookDetails {
    Scanner sc=new Scanner(System.in);
    Book b[]=new Book[10];
    int id,price;
    String bname,aname;
    int count=0;
    @Override
	public void addBook() {
		System.out.println("Add Book");
		System.out.println("Enter number of books you want to add");
        int a=sc.nextInt();	
        for(int i=0;i<a;i++)
        {
        	System.out.println("Enter book id:");
        	id=sc.nextInt();
        	System.out.println("Enter book name:");
        	bname=sc.next();
        	System.out.println("Enter book price:");
        	price=sc.nextInt();
        	System.out.println("Enter author name:");
        	aname=sc.next();
        	b[count]=new Book(id,bname,price,aname);
        	count++;
        }
        System.out.println("Add book successfully");
	}

	@Override
	public void updateBook() {
		System.out.println("Update Book");
		System.out.println("Enter Book Id you want to update");
		int bId=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(bId==b[i].getBId()&&b[i]!=null)
			{
				System.out.println("Enter Book name:");
			    bname=sc.next();
			    b[i].setName(bname);
			    System.out.println("Enter Author name:");
			    aname=sc.next();
			    b[i].setaName(aname);
			    System.out.println("Enter Book price:");
			    price=sc.nextInt();
			    b[i].setPrice(price);
			}
		}	
		System.out.println("Book update Succesfully");
	}

	@Override
	public void showBook() {
		for(int i=0;i<count;i++)
		{
			if(b[i]!=null)
			{
			System.out.println(b[i]);
			}
		}
		
	}

	@Override
	public void deleteBook() {
		System.out.println("Delete Book");
		System.out.println("Enter Book Id you want to delete");
		int bId=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(bId==b[i].getBId())
			{
				b[i]=null;
			}
			
		}
	  System.out.println("Deleted Book succesfully");
		
		
	}

	@Override
	public void searchBook() {
		System.out.println("Search Book");
		System.out.println("Enter Book Id you want to search");
		int bId=sc.nextInt();
		int flag=0;
		int i;
		for(i=0;i<count;i++)
		{
			if(bId==b[i].getBId()&&b[i]!=null)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Given book available");
		    System.out.println(b[i]);
		}
		else
		{
	  System.out.println("Given Book is not available");
		}
		
	}
		
	

}
