package com.containement;

public class MyLibrary {

	public static void main(String[] args) {
		
		
        Author a=new Author(101,"DEF");
        Author a1=new Author(102,"PQR");
        Author a2=new Author(103,"ABC");
        Author a3=new Author(104,"RTO");
        Author a4=new Author(105,"DVB");
        
        Book b=new Book(1,"XYZ",650f,a);
		Book b1=new Book(1,"RTE",800f,a1);
		Book b2=new Book(1,"NHT",950f,a2);
		Book b3=new Book(1,"XJY",850f,a3);
        
        System.out.println(b);
        System.out.println("----------------------");
        System.out.println(b1);
        System.out.println("----------------------");
        System.out.println(b2);
        System.out.println("----------------------");
        System.out.println(b3);
        
        System.out.println(new Author(103,"williamShakespere"));
        
        Book b4=new Book(3,"Hamlet",560f,new Author(103,"williamShakespere"));
        Book b5=new Book(4,"Julius Caeser",760f,new Author(103,"williamShakespere"));
	
	    System.out.println(b4);
        System.out.println(b5);
        
	}

}
