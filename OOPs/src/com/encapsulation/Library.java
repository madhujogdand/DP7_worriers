package com.encapsulation;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	Book b1=new Book();
	//implicit // hard core values
	b1.setBookId(101);
    b1.setBname("Harry Potter");
    b1.setPrice(900);
    
    System.out.println(b1.getBookId()+" "+b1.getBname()+" "+b1.getPrice());
    System.out.println(b1);
	
	//use input
    Book b2=new Book();
    System.out.println("enter Book Id: ");
//	int id=sc.nextInt();
//	b2.setBookId(id);
	
    b2.setBookId(sc.nextInt());
    System.out.println("enter Book Name: ");
    b2.setBname(sc.next());
    System.out.println("enter Book Price: ");
    b2.setPrice(sc.nextFloat());
	
    System.out.println(b2);
    
    
	}
	
	
	

}
